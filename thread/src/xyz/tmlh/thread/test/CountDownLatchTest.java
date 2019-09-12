package xyz.tmlh.thread.test;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch 允许一个或多个线程等待其他线程完成操作。   
 */
public class CountDownLatchTest {

    private CountDownLatch countDownLatch = new CountDownLatch(5);
    
    private Random random = new Random();
    
    public void a() {
        System.out.println(Thread.currentThread().getName() + "  进入a()");
        
        try {
            Thread.sleep(random.nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(Thread.currentThread().getName() + "  完成任务");
        countDownLatch.countDown();
    }

    public static void main(String[] args) {
        CountDownLatchTest test = new CountDownLatchTest();
        
        
        new Thread(test::a).start();
        new Thread(test::a).start();
        new Thread(test::a).start();
        new Thread(test::a).start();
        new Thread(test::a).start();
        
        try {
            test.countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(Thread.currentThread().getName() + "结束任务!");
        
    }

}
