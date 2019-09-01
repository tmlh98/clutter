package xyz.tmlh.thread.lock.readwrite;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @Author TianXin
 * @Date 2019年9月1日
 */
public class ReadWriteLockDemo {
    
    private Map<String, String> map = new HashMap<>();
    
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private Lock readLock = readWriteLock.readLock();
    private Lock writeLock = readWriteLock.writeLock();
    
    public void put(String key , String value) {
        try {
            writeLock.lock();
            
            System.out.println("writeLock.lock()");
            
            Thread.sleep(100);
            map.put(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            writeLock.unlock();
            System.out.println("writeLock.unlock()");
        }
    }
    
    public String get(String key) {
        String value = null;
        try {
            readLock.lock();
            
            System.out.println("readLock.lock()");
            
            Thread.sleep(50);
            value = map.get(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            readLock.unlock();
            System.out.println("readLock.unlock()");
        }
        return value ;
    }
    
    
    public static void main(String[] args) {
        ReadWriteLockDemo demo = new ReadWriteLockDemo();
        
        
        
        
        
//        new Thread(() ->  {
//            demo.put("a1", "v1");
//        }).start();
//        new Thread(() ->  {
//            demo.put("a2", "v2");
//        }).start();
        new Thread(() ->  {
            System.out.println(demo.get("a1"));
        }).start();
        
        new Thread(() ->  {
            System.out.println(demo.get("a1"));
        }).start();
        
        new Thread(() ->  {
            System.out.println(demo.get("a1"));
        }).start();
        
        
    }
    
}
