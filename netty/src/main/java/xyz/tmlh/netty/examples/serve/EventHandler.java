package xyz.tmlh.netty.examples.serve;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Set;

/**
 * 处理事件Selector事件
 * OP_READ
 * OP_ACCEPT
 */
public class EventHandler {


    private Selector selector;

    public EventHandler(Selector selector){
        this.selector = selector;

    }

    /**
     * 读事件，接受客户端消息，并发送给其他客户端
     *
     * @param selectionKey
     */
    public void read(SelectionKey selectionKey) throws IOException{
        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        int msgLen = 0;

        try {
            while ((msgLen = socketChannel.read(buffer)) > 0) {
                String msg = new String(buffer.array());
                System.out.println(socketChannel.getRemoteAddress() +  " say : " + msg);
                forward(msg , socketChannel);
            }
        } catch (IOException e) {
            String offLineHint = socketChannel.getRemoteAddress() + "已下线!";
            System.out.println( offLineHint);
            forward(offLineHint , socketChannel);
            selectionKey.channel();
            socketChannel.close();
        }


    }

    /**
     * 将消息转发给其他人
     * @param msg 消息
     * @param self 当前通道
     */
    public void forward(String msg , SocketChannel self) throws IOException{

        msg = self.getRemoteAddress().toString() + " say: "+ msg;

        for (SelectionKey key : selector.keys()){
            SelectableChannel channel = key.channel();

            if(channel instanceof  SocketChannel && channel != self){
                try {
                    SocketChannel socketChannel = (SocketChannel)channel;
                    socketChannel.write(ByteBuffer.wrap(msg.getBytes()));
                } catch (IOException e) {
                    System.out.println("群发消息失败!" );
                    e.printStackTrace();
                }
            }
        }

    }


}
