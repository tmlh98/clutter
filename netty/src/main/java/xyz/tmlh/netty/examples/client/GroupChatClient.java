package xyz.tmlh.netty.examples.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * client
 */
public class GroupChatClient {

    public static final int PORT = 6666;
    public static final String HOST = "localhost";
    private SocketChannel socketChannel;
    private Selector selector;

    public GroupChatClient() {
        System.out.println("客户端启动中...");

        try {
            selector = Selector.open();
            socketChannel = socketChannel.open(new InetSocketAddress(HOST, PORT));
            socketChannel.configureBlocking(false);
            socketChannel.register(selector, SelectionKey.OP_READ);
            System.out.println("客户端连接成功:" + socketChannel.getRemoteAddress().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 接受并打印消息
     */
    public void receiveMessage() {
        try {
            int selectLen = selector.selectNow();
            if (selectLen > 0) {
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = iterator.next();
                    if (selectionKey.isReadable()) {
                        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        socketChannel.read(buffer);
                        System.out.println(new String(buffer.array()));
                    }
                    iterator.remove();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 发送消息
     *
     * @param msg
     */
    public void sendMsg(String msg) {
        try {
            ByteBuffer buffer = ByteBuffer.wrap(msg.getBytes());
            socketChannel.write(buffer);
            System.out.println("发送成功!");
        } catch (IOException e) {
            System.out.println("发送失败!");
        }

    }

}
