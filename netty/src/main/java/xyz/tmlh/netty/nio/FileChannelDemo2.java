package xyz.tmlh.netty.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 */
public class FileChannelDemo2 {

    public static void main(String[] args) {

        File file = new File("e://01.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            FileChannel channel = fileInputStream.getChannel();


            ByteBuffer byteBuffer = ByteBuffer.allocate((int) file.length());
            channel.read(byteBuffer);


            System.out.println(new String(byteBuffer.array()));

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
