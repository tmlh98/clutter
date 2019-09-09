package xyz.tmlh.thread.communication.condition.demo5;

import java.util.Random;

/**
 * <p>
 *    
 * </p>
 *
 * @author TianXin
 * @since 2019年9月9日
 */
public class MyQueueDemo {

    
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>(3);
        
        
        new Thread(() -> {
            while(true) {
                queue.add(new Random().nextInt() * 1000 + "");
                System.out.println(queue);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            while(true) {
                queue.remove();
                System.out.println(queue);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        
    }
}
