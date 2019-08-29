package xyz.tmlh.thread;

/** 
 *  测试volatile保证共享变量的可见性:当共享变量被修改时，立即通知其他线程
 * @Author TianXin 
 * @Date 2019年8月28日 
 */
public class TestVolatile {

    static volatile boolean run;
    
    public static void main(String[] args) {
        
        new Thread(() ->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            run = true;
        }).start();
        new Thread(() ->{
            while(!run) {
                
            }
            System.out.println("共享变量被修改了！");
        }).start();
        
        
    }
    
}
