package xyz.tmlh.thread.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * 循环栅栏（循环锁） 核心原理： 基于 ReentrantLock 和 Condition。 CyclicBarrier 不仅具有 CountDownLatch 的功能，还有实现屏障等待的功能，也就是阶段性同步。
 */
/*
 * CyclicBarrier 的字面意思是可循环使用（Cyclic）的屏障（Barrier）。它要做的事情是，让一组线程到达一个屏障（也可以叫同步点）时被阻塞，
 * 直到最后一个线程到达屏障时，屏障才会开门，所有被屏障拦截的线程才会继续干活。CyclicBarrier默认的构造方法是CyclicBarrier(int parties)，
 * 其参数表示屏障拦截的线程数量，每个线程调用await方法告诉CyclicBarrier我已经到达了屏障，然后当前线程被阻塞。
 */
//CyclicBarrier还提供一个更高级的构造函数CyclicBarrier(int parties, Runnable barrierAction)，用于在线程到达屏障时，优先执行barrierAction，方便处理更复杂的业务场景
public class CyclicBarrierTest {
    
    private CyclicBarrier barrier = new CyclicBarrier(3);

    /**
     * 每次三个线程进入才会执行完方法，否则会堵塞在barrier.await();
      *
      * @param     参数
      * @return void    返回类型
      * @throws
     */
    public void a() {
        System.out.println(Thread.currentThread().getName() + "到达开始等待!");
        try {
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        
        System.out.println(Thread.currentThread().getName() + "结束等待!");
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrierTest test = new CyclicBarrierTest();
        
        Thread.sleep(1000);
        new Thread(test::a).start();
        Thread.sleep(1000);
        new Thread(test::a).start();
        Thread.sleep(1000);
        
        new Thread(test::a).start();
        Thread.sleep(1000);
        
        new Thread(test::a).start();
        Thread.sleep(1000);
        new Thread(test::a).start();
        Thread.sleep(1000);
        new Thread(test::a).start();
        Thread.sleep(1000);
    }
}
