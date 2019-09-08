package xyz.tmlh.thread.communication.condition.demo5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 
 * 实现有限制队列
 * 当队列满，添加的队列等待，但队列空，删除的队列等待
 */
public class MyQueue<E> {

    private Object[] list;
    
    public MyQueue(int size ) {
        list = new Object[size];
    }
    
    private int queueSize = 0 ;
    private int addIndex = 0 ;
    private int removeIndex = 0 ;
    private Lock lock = new ReentrantLock();
    private Condition addCondition = lock.newCondition();
    private Condition removeCondition = lock.newCondition();
    
    public void add(E obj) {
        
    }
    
    public void remove() {
        
    }
    
    
    
}
