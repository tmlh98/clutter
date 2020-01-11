package xyz.tmlh.netty.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 完成图片的copy
 */
public class FileChannelDemo3 {

    public static void main(String[] args) throws  Exception{
        FileInputStream fis = new FileInputStream("a.jpg");
        FileChannel fisChannel = fis.getChannel();

        FileOutputStream fos = new FileOutputStream("b.jpg");
        FileChannel fosChannel = fos.getChannel();

//        handleCopy1(fisChannel , fosChannel);
        handleCopy2(fisChannel , fosChannel);
        fos.close();
        fis.close();
    }

    static void handleCopy1(FileChannel fisChannel , FileChannel fosChannel) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while (true){
            int read = fisChannel.read(buffer);
            System.out.println("read: " + read);

            if(read == -1){
                break;
            }

            buffer.flip();
            fosChannel.write(buffer);
            //刷新buffer。不然read一直等于0
            buffer.clear();
        }

    }

    /**
     * 使用transferTo copy
     * @param fisChannel
     * @param fosChannel
     * @throws IOException
     */
    static void handleCopy2(FileChannel fisChannel , FileChannel fosChannel) throws IOException {
        fisChannel.transferTo(0 , fisChannel.size() , fosChannel);

    }

}
