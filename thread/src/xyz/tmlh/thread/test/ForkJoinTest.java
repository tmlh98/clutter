package xyz.tmlh.thread.test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Future<Integer> future = forkJoinPool.submit(new ForkJoinDemo(1, 100));
        Integer integer = future.get();
        System.out.println(integer);
    }

}

class ForkJoinDemo extends RecursiveTask<Integer> {
    private static final long serialVersionUID = -5018535802566085301L;
    private int start;
    private int end;
    public ForkJoinDemo(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if(end - start <= 2) {
            // 计算结果
            for (int i = start ; i <= end; i++) {
                sum += i;
            }
        }else {
            int middle = (end + start) / 2 ;
            ForkJoinDemo demo1 = new ForkJoinDemo(start , middle);
            ForkJoinDemo demo2 = new ForkJoinDemo(middle + 1 , end);
            demo1.fork();
            demo2.fork();
            sum = demo1.join() + demo2.join();
        }
        
        return sum;
    }
}
