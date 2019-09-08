package xyz.tmlh.thread.communication;

import java.util.concurrent.TimeUnit;

/** 
 *  消费者模型
 */
public class Consumer implements Runnable{

    private Product product;
    
    public Consumer(Product product){
        this.product = product;
    }
    
    @Override
    public void run() {
        while(true) {
            product.consume();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
