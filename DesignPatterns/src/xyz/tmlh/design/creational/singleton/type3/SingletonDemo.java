package xyz.tmlh.design.creational.singleton.type3;

/*
 * 线程安全；延迟加载；效率较高 
 */
public class SingletonDemo {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1);
        System.out.println(singleton2);

        System.out.println("=======多线程环境下========");
        //可以让线程休眠测试
        for (int i = 0; i < 10; i++) {
            new Thread(()->  System.out.println(Singleton.getInstance() )).start();
        }
        
    }

}

// 懒汉式（双重检测锁式）
class Singleton {
    private Singleton() {}

    private static volatile Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) { // 由于指令重排序 还是可能出现线程安全问题
                    singleton = new Singleton();
                }
            }
        }

        return singleton;
    }

}