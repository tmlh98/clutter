package xyz.tmlh.thread.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTest {

    
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("去蛋糕店下订单!");
                Thread.sleep(1000);
                return "获得蛋糕🎂!";
            }
        };
        FutureTask<String> future = new FutureTask<>(callable );
        
        Thread thread = new Thread(future);
        thread.run();
        System.out.println("干点别的事!");
        
        String result = future.get();
        System.out.println(result);
    }
    
    
}
