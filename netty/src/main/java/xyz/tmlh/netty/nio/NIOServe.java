package xyz.tmlh.netty.nio;



import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class NIOServe {
    public static void main(String[] args) throws  Exception{

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

        //绑定6666端口
        serverSocketChannel.bind(new InetSocketAddress(6666));
        //设置成非阻塞模式
        serverSocketChannel.configureBlocking(false);

        //得到一个Selector对象
        Selector selector = Selector.open();

        //将socketChannel注册到Selector上 , 注册事件： OP_ACCEPT
        serverSocketChannel.register(selector , SelectionKey.OP_ACCEPT);
        //等待客户端连接
        while(true){

            //等待1s,如果没有发生事件，就返回
            if(selector.select(1000) == 0){
                System.out.println("等待了1s ,没有事件发生！");
                continue;
            }

            //如果selector.select(1000)>0 说明有事件发生
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> keyIterator = selectionKeys.iterator();

            while (keyIterator.hasNext()){
                SelectionKey selectionKey = keyIterator.next();
                //对OP_ACCEPT事件作相应处理
                if(selectionKey.isAcceptable()){
                    System.out.println("有客户端注册成功！");
                    //如果发现有客户端注册成功,就生成对应的SocketChannel
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    //将  SocketChannel 设置为非阻塞
                    socketChannel.configureBlocking(false);
                    //并且将SocketChannel注册到Selector ， 并绑定事件OP_READ
                    //关联一个Buffer
                    socketChannel.register(selector, SelectionKey.OP_READ, ByteBuffer.allocate(1024));
                }

                //如果是并绑定事件OP_READ事件，做相应处理
                if(selectionKey.isReadable()){
                    //根据selectionKey获取SocketChannel
                    SocketChannel sc = (SocketChannel)selectionKey.channel();
                    ByteBuffer bb= (ByteBuffer)selectionKey.attachment();
                    //把SocketChannel数据读进ByteBuffer
                    sc.read(bb);
                    System.out.println(new String(bb.array()));


                }

                //删除对应的keyIterator ， 防止重复操作
                keyIterator.remove();

            }
        }


    }
}
