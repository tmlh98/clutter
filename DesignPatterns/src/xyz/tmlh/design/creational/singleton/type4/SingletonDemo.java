package xyz.tmlh.design.creational.singleton.type4;

/*
 * 静态内部类法
 * 1）类装载时静态内部类不会状态（解决懒加载）
 * 当调用getInstance()才开始装载静态内部类 ,且只会装载一次。
 * 2) 类装载时是线程安全的
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

class Singleton {
    private Singleton() {}
    private static class SingleClassInstance {
        private static final Singleton instance = new Singleton();
    }
    
    public static Singleton getInstance() {
        return SingleClassInstance.instance;
    }

}