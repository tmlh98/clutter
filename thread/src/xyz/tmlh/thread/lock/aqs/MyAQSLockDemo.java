package xyz.tmlh.thread.lock.aqs;

/**
 *
 * @Author TianXin
 * @Date 2019年9月1日
 */
public class MyAQSLockDemo {
    
    private  MyAQSLock lock = new MyAQSLock();
    
    private int count = 0;
    public int next() throws InterruptedException{
        lock.lock();
        Thread.sleep(5);
        count ++;
        lock.unlock();
        return count;
    }
    
    public void a() {
        lock.lock();
        System.out.println("a()");
        b();
        lock.unlock();
    }
    public void b() {
        lock.lock();
        System.out.println("b()");
        lock.unlock();
    }
    
    public static void main(String[] args){
        testSync();
        MyAQSLockDemo demo = new MyAQSLockDemo();
        demo.a();
    }


    private static void testSync() {
        MyAQSLockDemo demo = new MyAQSLockDemo();
        
        new Thread(()-> {
            try {
                for (int i = 0; i < 100; i++)
                System.out.println(demo.next());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()-> {
            try {
                for (int i = 0; i < 100; i++)
                    System.out.println(demo.next());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()-> {
            try {
                for (int i = 0; i < 100; i++)
                    System.out.println(demo.next());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        
        while (Thread.activeCount() != 1) {
        }
        
        System.out.println("count: " + demo.count);
    }
}
