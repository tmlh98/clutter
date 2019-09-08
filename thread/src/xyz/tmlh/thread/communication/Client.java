package xyz.tmlh.thread.communication;

/**
 *
 * @Author TianXin
 * @Date 2019年9月2日
 */
public class Client {
    public static void main(String[] args) {
        Product product = new Product();
        
        Consumer consumer = new Consumer(product);
        Producer producer = new Producer(product);
        
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer).start();
        
        
        
    }
}
