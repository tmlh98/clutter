package xyz.tmlh.thread.communication;

/** 
 *  产品
 */
public class Product {

    private int sum ;
    
    private final static int MAX_SUM = 10;
   
    public synchronized void production() {
        while(sum >= MAX_SUM) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //唤醒消费者
            notifyAll();
        }
        
        
        sum ++;
        System.out.println("生产者生产,产品数量 ：" + sum);
    }
    public synchronized void consume() {
        while(sum <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //唤醒生产者生产
            notifyAll();
        }
        
        sum --;
        System.out.println("消费者消费,产品数量 ：" + sum);
    }
    
}
