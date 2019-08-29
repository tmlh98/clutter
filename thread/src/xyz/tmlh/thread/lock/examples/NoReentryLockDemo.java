package xyz.tmlh.thread.lock.examples;

/**
 * 不可重入锁🔒
 *
 * @Author TianXin
 * @Date 2019年8月27日
 */
public class NoReentryLockDemo {
    
    private NoReentryLock lock = new NoReentryLock();

    private int count = 0;

    // 此时有共享变量，并且count++ 非原子性操作
    private int getCount() {
        lock.lock();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        lock.unLock();
        return count;
    }


    public static void main(String[] args) {
        NoReentryLockDemo demo = new NoReentryLockDemo();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(demo.getCount());
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(demo.getCount());
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(demo.getCount());
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(demo.getCount());
            }
        }).start();

        System.out.println("======================");

//        demo.a();
    }

    public void a() {
        lock.lock();
        System.out.println("a()");
        b();
        lock.unLock();
    }

    public void b() {
        lock.lock();
        System.out.println("b()");
        lock.unLock();
    }

}

// 如果一个线程在两次调用lock()间没有调用unlock()方法，那么第二次调用lock()就会被阻塞，这就出现了重入锁死。
class NoReentryLock {

    private boolean isLocked = false;

    public synchronized void lock() {
        while (isLocked) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isLocked = true;
    }

    public synchronized void unLock() {
        isLocked = false;
        notify();
    }

}