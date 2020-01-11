package xyz.tmlh.netty.nio;


import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

/**
 * NIO入门案例(客户端)
 */
public class NIOClient {

    public static void main(String[] args) throws Exception{

        //得到一个网络通道
        SocketChannel socketChannel = SocketChannel.open();
        //设置成非阻塞模式
        socketChannel.configureBlocking(false);
        //指定连接的主机信息
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 6666);

        //连接
        if(!socketChannel.connect(inetSocketAddress)){

            while (!socketChannel.finishConnect()){

                System.out.println("正在连接, 客户端不会阻塞 , 这里可以进行其他操作!");
//                TimeUnit.SECONDS.sleep(1);
            }
        }

        String str = "hello ,NIO !";

        //如果连接成功，先服务端发送数据
        ByteBuffer buffer = ByteBuffer.wrap(str.getBytes());
        socketChannel.write(buffer);

        System.out.println("先服务端发送数据"+str+ "成功!");
        System.in.read();

    }
}
