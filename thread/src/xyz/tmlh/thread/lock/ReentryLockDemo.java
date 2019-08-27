package xyz.tmlh.thread.lock;

/**
 * 锁重入
 *
 * @Author TianXin 
 * @Date 2019年8月27日
 */
public class ReentryLockDemo {

    public static void main(String[] args) {
        //锁重入
        new Thread(() -> {
            ReentryLockDemo reentryLock = new ReentryLockDemo();
            reentryLock.a();
        }) .start();
        
        
        // 锁住同一个对象时 ， 后面一个线程会等待前一个线程释放锁
        ReentryLockDemo reentryLock = new ReentryLockDemo();
        new Thread(() -> {
            reentryLock.c();
        }) .start();
        new Thread(() -> {
            reentryLock.d();
        }) .start();
        
        
        
        
    }

    public synchronized void a() {
        System.out.println("a()");
        b();
    }
    public synchronized void b() {
        System.out.println("b()");
        
    }
    public synchronized void c()   {
        System.out.println("c()");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
    public synchronized void d() {
        System.out.println("d()");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
