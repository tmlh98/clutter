package xyz.tmlh.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
 *Executors.newCachedThreadPool() 会智能分配线程池大小
 * @Author TianXin 
 * @Date 2019年8月25日 
 */
public class ExecutorDemo {

    public static void main(String[] args) {
        
//        ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        
        for (int i = 0; i < 100; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " : run() ");
                }
            });
        }
        
        
        executorService.shutdown();
        
    }
    
}
