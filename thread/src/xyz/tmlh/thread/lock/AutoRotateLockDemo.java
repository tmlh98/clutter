package xyz.tmlh.thread.lock;

import java.util.Random;

/**
 * 自选测试
 * 
 * @Author TianXin
 * @Date 2019年8月27日
 */
public class AutoRotateLockDemo {
    public static void main(String[] args) {
//        ExecutorService executor = Executors.newFixedThreadPool(10);
        new Thread(new AutoRotateThread()).start();
        new Thread(new AutoRotateThread()).start();
        new Thread(new AutoRotateThread()).start();
        new Thread(new AutoRotateThread()).start();
        new Thread(new AutoRotateThread()).start();
        
        //打印所有线程执行完毕
        while (Thread.activeCount() != 1) {
            //自旋
        }
        
        System.out.println("~~~~~~~~~~~~~~所有线程执行完毕");
        
    }
}

class AutoRotateThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" 开始执行!" );
        try {
            Thread.sleep(new Random().nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() +" 执行结束!" );
    }
    
}