package xyz.tmlh.netty.nio.examples;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

public class GroupChatServer {

    private static  final int PROT = 6666;

    private ServerSocketChannel listenChannel;

    private Selector selector;

    /**
     * 初始化
     */
    public GroupChatServer(){

        //初始化Selector对象
        try {
            selector = Selector.open();

            listenChannel = ServerSocketChannel.open();

            listenChannel.bind(new InetSocketAddress(PROT));
            listenChannel.configureBlocking(false);

            //将socketChannel注册到Selector上 , 注册事件： OP_ACCEPT , 监听用户上线
            listenChannel.register(selector , SelectionKey.OP_ACCEPT);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 监听客户端消息
     */
    public void listen() {

        System.out.println("服务端启动成功,正在监听!");

        for (;;){
            try {
                //等待1s,如果没有发生事件，就返回
                if(selector.select() > 0){
                    Iterator<SelectionKey> keyIterator = selector.selectedKeys().iterator();
                    //循环处理发生的事件
                    while (keyIterator.hasNext()){
                        SelectionKey selectionKey = keyIterator.next();

                        //如果是用户注册
                        if(selectionKey.isAcceptable()){
                            //生成对应SocketChannel
                            SocketChannel socketChannel = listenChannel.accept();
                            socketChannel.configureBlocking(false);

                            //并注册读事件
                            socketChannel.register(selector , SelectionKey.OP_READ);

                            System.out.println(socketChannel.getRemoteAddress() + " 上线 ");
                        }

                        if(selectionKey.isReadable()){//通道发送read事件，即通道是可读的状态
                            handleRead(selectionKey);//处理读
                        }
                        //删除事件，避免重复处理
                        keyIterator.remove();

                    }
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    /**
     * 处理读事件，及接受用户的消息，并转发
     * @param selectionKey
     */
    private void handleRead(SelectionKey selectionKey) throws IOException{
        SocketChannel channel = (SocketChannel)selectionKey.channel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);


        try{
            int count = channel.read(byteBuffer);
            if(count > 0){
                String msg = new String(byteBuffer.array());

                System.out.println("form 客户端: " + msg);

                //向其它的客户端转发消息(去掉自己), 专门写一个方法来处理
                sendInfoToOtherClients(msg, channel);
            }
        }catch (IOException e){
            System.out.println(channel.getRemoteAddress() + "已下线!");
            //取消注册
            selectionKey.cancel();
            //关闭通道
            channel.close();
        }


    }

    private void sendInfoToOtherClients(String msg, SocketChannel self) throws IOException{
        System.out.println("服务器转发消息中...");

        for(SelectionKey key : selector.keys()){
            SelectableChannel channel = key.channel();
            //排除自己
            if(channel instanceof  SocketChannel && channel != self) {

                //转型
                SocketChannel dest = (SocketChannel)channel;
                //将msg 存储到buffer
                ByteBuffer buffer = ByteBuffer.wrap(msg.getBytes());
                //将buffer 的数据写入 通道
                System.out.println("服务器转发数据给客户端: " + dest.getRemoteAddress());
                dest.write(buffer);
            }
        }

    }


}
