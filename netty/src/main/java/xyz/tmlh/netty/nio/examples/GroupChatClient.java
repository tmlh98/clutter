package xyz.tmlh.netty.nio.examples;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;

public class GroupChatClient {

    private static final String HOST = "127.0.0.1";
    private static final int PORT = 6666;

    private SocketChannel socketChannel;
    private Selector selector;

    public GroupChatClient() {
        try {
            selector = Selector.open();
            socketChannel = SocketChannel.open(new InetSocketAddress(HOST, PORT));
            socketChannel.configureBlocking(false);
            socketChannel.register(selector ,SelectionKey.OP_READ);

            System.out.println(socketChannel.getLocalAddress() + "登录!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 发送消息
     * @param msg 消息
     */
    public void  sendMessage(String msg){

        try {
            msg = socketChannel.getLocalAddress() + "说: " + msg;

            socketChannel.write(ByteBuffer.wrap(msg.getBytes() ));
            System.out.println("发送成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 接收消息
     * @param
     */
    public void readMessage(){
        try {
            if(selector.select() > 0){
                Iterator<SelectionKey> keyIterator = selector.selectedKeys().iterator();

                while (keyIterator.hasNext()){
                    SelectionKey key = keyIterator.next();

                    if(key.isReadable()){
                        SocketChannel sc = (SocketChannel)key.channel();
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        sc.read(buffer);
                        System.out.println(new String(buffer.array()));
                    }
                }

                keyIterator.remove();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        GroupChatClient client = new GroupChatClient();

        new Thread(()->{
            for (;;){
                client.readMessage();
                try {
                    Thread.currentThread().sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Scanner sc = new Scanner(System.in);


        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            client.sendMessage(s);
        }


    }
}
