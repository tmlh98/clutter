package xyz.tmlh.thread.example;

import java.util.concurrent.Exchanger;

public class Print {
    public static void main(String[] args) {
        // 交换器
        Exchanger<Integer> exchanger = new Exchanger<>();
        // 起始打印数值
        Integer startNumber = 1;
        // 终止的数值
        Integer endNumber= 100;

        // 线程1
        Thread t1 = new Thread(new Thread1(exchanger, startNumber, endNumber));
        Thread t2 = new Thread(new Thread2(exchanger, startNumber, endNumber));
        // 设置线程名称
        t1.setName("thread-no-1");
        t2.setName("thread-no-2");
        // 启动线程
        t1.start();
        t2.start();
    }
}

/**
 * 打印奇数的线程
 */
class Thread1 implements Runnable {
    private Exchanger<Integer> exchanger;
    /** 被打印的数 */
    private Integer number;
    private final Integer endNumber;

    public Thread1(Exchanger<Integer> exchanger, Integer startNumber, Integer endNumber) {
        this.exchanger = exchanger;
        this.number = startNumber;
        this.endNumber = endNumber;
    }

    @Override
    public void run() {
        while (number <= endNumber) {
            if (number % 2 == 1) {
                System.out.println("线程：" + Thread.currentThread().getName() + " : " + number);
            }
            try {
                exchanger.exchange(number++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/**
 * 打印偶数的线程
 */
class Thread2 implements Runnable {
    private Exchanger<Integer> exchanger;
    /** 被打印的数 */
    private Integer number;
    private final Integer endNumber;

    public Thread2(Exchanger<Integer> exchanger, Integer startNumber, Integer endNumber) {
        this.exchanger = exchanger;
        this.number = startNumber;
        this.endNumber = endNumber;
    }

    @Override
    public void run() {
        while (number <= endNumber) {
            if (number % 2 == 0) {
                System.out.println("线程：" + Thread.currentThread().getName() + " : " + number);
            }
            try {
                exchanger.exchange(number++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}