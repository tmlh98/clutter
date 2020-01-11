package xyz.tmlh.netty.nio;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 */
public class FileChannelDemo {

    public static void main(String[] args) {

        String str = "hello, FileChannel" ;

        //创建输出流并获取FileChannel
        try (FileOutputStream fos = new FileOutputStream("e://01.txt")) {
            FileChannel channel = fos.getChannel();

            //创建ByteBuffer，并分配1024个空间
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            //将str放入byteBuffer
            byteBuffer.put(str.getBytes());

            //反转
            byteBuffer.flip();

            //将byteBuffer写入通道
            channel.write(byteBuffer);



        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
