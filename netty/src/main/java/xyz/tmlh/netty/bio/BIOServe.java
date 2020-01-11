package xyz.tmlh.netty.bio;



import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用BIO模型编写一个服务器端，监听6666端口，当有客户端连接时，就启动一个线程与之通讯。
 * 测试
 * 1.[cmd] telnet 127.0.1.1 9999
 * 2.[cmd] CTRL+]
 * 3.[cmd] send test1
 */
/*
 * 1、每个请求都需要创建独立的线程，与对应的客户端进行数据 Read，业务处理，数据 Write 。
 * 2、当并发数较大时，需要创建大量线程来处理连接，系统资源占用较大。
 * 3、连接建立后，如果当前线程暂时没有数据可读，则线程就阻塞在 Read 操作上，造成线程资源浪费
 */
public class BIOServe {

    public static void main(String[] args) throws Exception{

        ExecutorService threadPool = Executors.newCachedThreadPool();

        //监听6666端口
        ServerSocket serverSocket = new ServerSocket(9999);

        while (true){

            //监听请求
            final Socket socket = serverSocket.accept();//没有客户端连接时会阻塞


            threadPool.execute(() -> handle(socket) );
        }


    }


    public static void handle(Socket socket)   {

        System.out.println();
        try {
            InputStream inputStream = socket.getInputStream();

            byte[] b = new byte[1024];

            int read = 0;
            while(( read = inputStream.read(b))  != -1){//客户端未发送消息是会阻塞
                System.out.println("当前线程: " + Thread.currentThread().getName() +
                        "接送消息: " + new java.lang.String(b , 0 , read));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{

            socket.close();
            }catch (IOException ioe){
                ioe.printStackTrace();
            }
        }


    }
}
