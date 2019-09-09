package xyz.tmlh.thread.communication.condition.demo5;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 实现有限制队列 当队列满，添加的队列等待，当队列空，删除的队列等待
 */
public class MyQueue<E> {

    private Object[] list;

    public MyQueue(int size) {
        list = new Object[size];
    }

    // 数组内元素的个数
    private int elementSum = 0;
    private int addIndex = 0;
    private int removeIndex = 0;
    private Lock lock = new ReentrantLock();
    private Condition addCondition = lock.newCondition();
    private Condition removeCondition = lock.newCondition();

    public void add(E obj) {
        lock.lock();
        while (elementSum == list.length) {
            try {
                addCondition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        list[addIndex++] = obj;
        elementSum++;
        // 当元素满时，不在增加
        if (addIndex == list.length) {
            addIndex = 0;
        }
        removeCondition.signal();
        lock.unlock();
    }

    public void remove() {
        lock.lock();

        while (elementSum == 0) {
            try {
                removeCondition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        list[removeIndex++] = null;

        if (removeIndex == list.length) {
            removeIndex = 0;
        }

        elementSum--;
        addCondition.signal();

        lock.unlock();
    }

    @Override
    public String toString() {
        return "MyQueue [list=" + Arrays.toString(list) + ", elementSum=" + elementSum + ", addIndex=" + addIndex + ", removeIndex=" + removeIndex + "]";
    }

}
