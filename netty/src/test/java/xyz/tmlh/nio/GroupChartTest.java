package xyz.tmlh.nio;

import org.junit.Test;
import xyz.tmlh.netty.examples.client.GroupChatClient;
import xyz.tmlh.netty.examples.serve.GroupChatServe;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GroupChartTest {

    @Test
    public void testServe() {
        GroupChatServe groupChatServe = new GroupChatServe();
        groupChatServe.listen();
    }

    @Test
    public void testClient(){
        GroupChatClient groupClient = new GroupChatClient();
        new Thread(()->{
            for (;;){
                groupClient.receiveMessage();
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Scanner sc = new Scanner(System.in);

        System.out.println("请发送:");
        while (sc.hasNext()){
            String msg = sc.next();
            groupClient.sendMsg(msg);
            System.out.println();
        }

    }


}

