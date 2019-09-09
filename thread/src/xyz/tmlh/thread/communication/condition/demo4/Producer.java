package xyz.tmlh.thread.communication.condition.demo4;

import java.util.concurrent.TimeUnit;

/**
 * 生产者模型
 */
public class Producer implements Runnable {

    private Product product;

    public Producer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        while (true) {
            product.production();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
