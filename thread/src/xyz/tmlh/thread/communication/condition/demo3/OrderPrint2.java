package xyz.tmlh.thread.communication.condition.demo3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

/**
 * 三个线程按顺序打印ABCABC....
 */
public class OrderPrint2 {

    private int signal = 0;

    private Lock lock = new ReentrantLock();

    private Condition a = lock.newCondition();
    private Condition b = lock.newCondition();
    private Condition c = lock.newCondition();

    public void printA() {
        lock.lock();
        while (signal % 3 != 0) {
            try {
                a.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("A");
        signal++;
        b.signal();
        lock.unlock();
    }

    public void printB() {
        lock.lock();
        while (signal % 3 != 1) {
            try {
                b.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("B");
        signal++;
        c.signal();
        lock.unlock();
    }

    public void printC() {
        lock.lock();
        while (signal % 3 != 2) {
            try {
                c.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("C");
        signal++;
        a.signal();

        lock.unlock();
    }

    public static void main(String[] args) {
        OrderPrint2 orderPrint = new OrderPrint2();

        new Thread(new A(orderPrint)).start();
        new Thread(new B(orderPrint)).start();
        new Thread(new C(orderPrint)).start();
    }

}

class A implements Runnable {
    private OrderPrint2 orderPrint;

    public A(OrderPrint2 orderPrint) {
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
    private OrderPrint2 orderPrint;

    public B(OrderPrint2 orderPrint) {
        this.orderPrint = orderPrint;
    }

    @Override
    public void run() {
        while (true) {
            orderPrint.printB();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C implements Runnable {
    private OrderPrint2 orderPrint;

    public C(OrderPrint2 orderPrint) {
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