package xyz.tmlh.thread;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * 定时器Demo
 * 
 * @Author TianXin
 * @Date 2019年8月25日
 */
public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            
            @Override
            public void run() {
                System.out.println("定时器Demo");
            }
        }, 1000 , 1000);
        
        
    }
}
