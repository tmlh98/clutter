package xyz.tmlh.thread.communication.condition.demo4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 
 *  产品
 */
public class Product {

    private int sum ;
    
    private Lock lock = new ReentrantLock();
    private Condition p = lock.newCondition();
    private Condition c = lock.newCondition();
    
    
    private final static int MAX_SUM = 10;
   
    public void production() {
        lock.lock();
        
        while(sum >= MAX_SUM) {
            try {
                p.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //唤醒消费者
            c.signal();
        }
        
        
        sum ++;
        System.out.println("生产者生产,产品数量 ：" + sum);
        lock.unlock();
    }
    public synchronized void consume() {
        lock.lock();
        while(sum <= 0) {
            try {
                c.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //唤醒生产者生产
            p.signal();
        }
        
        sum --;
        System.out.println("消费者消费,产品数量 ：" + sum);
        lock.unlock();
    }
    
}
