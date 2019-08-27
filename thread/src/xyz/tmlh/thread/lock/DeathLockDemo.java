package xyz.tmlh.thread.lock;

/** 
 *
 *死锁
 * @Author TianXin 
 * @Date 2019年8月27日 
 */
public class DeathLockDemo {
    
    private static DeathLockDemo obj1 = new DeathLockDemo();
    private static DeathLockDemo obj2 = new DeathLockDemo();

    public void a() {
        synchronized (obj1) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj2) {
                System.out.println("a()");
            }
        }
    }
    public void b() {
        synchronized (obj2) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj1) {
                System.out.println("b()");ss
            }
        }
    }
    
    
    public static void main(String[] args) {
        new Thread(()->obj1.a()).start();
        new Thread(()->obj2.b()).start();
    }
    
}
