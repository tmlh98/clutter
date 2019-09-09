package xyz.tmlh.thread.communication.condition.demo2;

import java.util.concurrent.TimeUnit;

/**
 * 三个线程按顺序打印ABCABC....
 */
public class OrderPrint {
    
    private int signal = 0;

    public synchronized void printA() {
        while(signal % 3 != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A");
        signal ++;
        notifyAll();
    }

    public synchronized void printB() {
        while(signal % 3 != 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("B");
        signal ++;
        notifyAll();
    }

    public synchronized void printC() {
        while(signal % 3 != 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("C");
        signal ++;
        notifyAll();
    }

    public static void main(String[] args) {
        OrderPrint orderPrint = new OrderPrint();

        new Thread(new A(orderPrint)).start();
        new Thread(new B(orderPrint)).start();
        new Thread(new C(orderPrint)).start();
    }

}

class A implements Runnable {
    private OrderPrint orderPrint;

    public A(OrderPrint orderPrint) {
        this.orderPrint = orderPrint;
    }

    @Override
    public void run() {
        while (true) {
            orderPrint.printA();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    private OrderPrint orderPrint;

    public B(OrderPrint orderPrint) {
        this.orderPrint = orderPrint;
    }

    @Override
    public void run() {
        while (true) {
            orderPrint.printB();
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C implements Runnable {
    private OrderPrint orderPrint;

    public C(OrderPrint orderPrint) {
        this.orderPrint = orderPrint;
    }

    @Override
    public void run() {
        while (true) {
            orderPrint.printC();
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}