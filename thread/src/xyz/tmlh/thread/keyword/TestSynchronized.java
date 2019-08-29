package xyz.tmlh.thread.keyword;

/*
 * 类锁 和 对象锁不是同一把锁，相互之间互不干扰
 */
public class TestSynchronized {
    
    public synchronized void a(){
        int i = 5 ; 
        while(i-- > 0 ) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : " + i );
        }
        
    }
    
    public static synchronized void b(){
        int i = 5 ; 
        while(i-- > 0 ) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " : " + i );
        }
        
    }
    
    public static void main(String[] args) {
        TestSynchronized test = new TestSynchronized();
        Thread thread1 = new Thread(test::a);
        Thread thread2 = new Thread(TestSynchronized::b);
        thread1.start();
        thread2.start();
    }
    
    
}
