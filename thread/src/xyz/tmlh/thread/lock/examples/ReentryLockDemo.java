package xyz.tmlh.thread.lock.examples;

/**
 *  改良重入锁🔒
 *
 * @Author TianXin 
 * @Date 2019年8月27日
 */
public class ReentryLockDemo {

    private ReentryLock lock = new ReentryLock();
    
    public static void main(String[] args) {
        new ReentryLockDemo().a();
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
        c();
        lock.unLock();
    }
    
    public void c() {
        lock.lock();
        System.out.println("c()");
        lock.unLock();
    }
    
}

/**
 * 分析:${@NoReentryLock} 不可重入原因 :  第一次进入a(),对象会获得lock，并把isLocked置为true , 
 * 此时锁还没有释放 ， 就进入b() ，此时isLock等于true,程序执行wait() ,当前线程休眠。
 * <br/>
 */
//优化后:
class ReentryLock{

    //是否持有锁
    private boolean isLocked;
    //当前持有锁的线程
    private Thread current;
    //当前线程重入的次数
    private int count = 0;
    
    public synchronized  void lock() {
        Thread currentThread = Thread.currentThread();
        while(isLocked && currentThread != current) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        isLocked = true;
        current = currentThread;
        count ++;
    }

    //只有最后一次解锁才释放锁
    public synchronized  void unLock() {
        if(current == Thread.currentThread()) {
            if(count == 1) {
                isLocked = false;
                current = null;
                notify();
            }
            count --;
        }
    }
    
}