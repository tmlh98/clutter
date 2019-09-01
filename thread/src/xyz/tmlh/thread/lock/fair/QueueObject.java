package xyz.tmlh.thread.lock.fair;

/** 
 * http://ifeve.com/starvation-and-fairness/
 * </br>
 *  一个锁的队列对象
 * @Author TianXin 
 * @Date 2019年9月1日 
 */
public class QueueObject {

    //是否被唤醒
    private boolean isNotified = false;
    
    /**
     */
    public synchronized void doWait() throws InterruptedException {
        while(!isNotified) {
            this.wait();
        }
        
        isNotified = false;
    }

    public synchronized void doNotify() {
        this.notify();
        isNotified = true;
    }
    
    
    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }
    
}
