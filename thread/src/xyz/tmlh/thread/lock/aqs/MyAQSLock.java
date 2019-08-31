package xyz.tmlh.thread.lock.aqs;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/** 
 * 使用AQS实现自己的锁
 * @Author TianXin 
 * @Date 2019年8月31日 
 */
public class MyAQSLock implements Lock{

    private MySync sync = new MySync();
    
    //实现自定义同步器
    private class MySync extends AbstractQueuedSynchronizer{
        
        private static final long serialVersionUID = 1L;

        @Override
        protected boolean tryAcquire(int arg) {
            //如果第一个线程进来，我们可以拿到锁。返回true
            
            // 第二个线程进来，如果第二个线程 等于第一个线程 ， 则更新状态 +1 ,否则返回false
            
            int state = getState();
            
            Thread currentThread = Thread.currentThread();
            //state == 0 此时没有线程获得锁
            if(state == 0) {
                if(compareAndSetState(state, arg)) {
                  //设置排他线程
                  setExclusiveOwnerThread(currentThread);  
                  return true;
                }
            }else if (currentThread == getExclusiveOwnerThread()) {
                //此时没有线程安全问题，可以直接更新state的值
                setState(state + 1);
                return true;
            }
            
            return false;
        }
        
        @Override
        protected boolean tryRelease(int arg) {
            //如果排他线程不是此线程 ， 直接抛出异常
            if (getExclusiveOwnerThread() != Thread.currentThread()) {
                throw new RuntimeException("错误的线程!");
            }
            int state = getState() - arg;
            
            boolean flag = false;
            // 正确的释放锁
            if(state == 0) {
                setExclusiveOwnerThread(null);
                flag = true;
            }
            
            setState(0);
            return flag;
        };
        
        public Condition newCondition() {
            return new ConditionObject();
        }
    }

    @Override
    public void lock() {
        sync.acquire(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1);
    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return sync.tryAcquireNanos(1, unit.toNanos(time));
    }

    @Override
    public void unlock() {
        sync.release(1);
    }

    @Override
    public Condition newCondition() {
        return sync.newCondition();
    }
    
    
}
