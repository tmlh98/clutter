package xyz.tmlh.thread.lock.fair;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Java中导致饥饿的原因 在Java中，下面三个常见的原因会导致线程饥饿：</br>
 * 1)高优先级线程吞噬所有的低优先级线程的CPU时间。</br>
 * 2)线程被永久堵塞在一个等待进入同步块的状态，因为其他线程总是能在它之前持续地对该同步块进行访问。</br>
 * 3)线程在等待一个本身(在其上调用wait())也处于永久等待完成的对象，因为其他线程总是被持续地获得唤醒。
 */
public class FairLock {

    private boolean isLocked = false;
    private Thread lockingThread = null;
    private List<QueueObject> waitingThreads = new ArrayList<QueueObject>();

    
    public void lock() throws InterruptedException {
        QueueObject queueObject = new QueueObject();
        
        synchronized (this) {
            waitingThreads.add(queueObject);
        }
        
        try {
            queueObject.doWait();
        } catch (InterruptedException e) {
            waitingThreads.remove(queueObject);
            throw e;
        }
        
    }
    
    
    public synchronized void unlock() {
        if (this.lockingThread != Thread.currentThread()) {
            throw new IllegalMonitorStateException("Calling thread has not locked this lock");
        }
        isLocked = false;
        lockingThread = null;
        if (waitingThreads.size() > 0) {
            waitingThreads.get(0).doNotify();
        }
    }
    
}
