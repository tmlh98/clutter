package xyz.tmlh.design.creational.singleton.type5;

/*
 * 枚举单例式
1）枚举本身就是单例的。由JVM从根本上提供保障，避免通过反射和反序列化的漏洞
2）无延迟加载
 */
public class SingletonDemo {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        System.out.println("=======多线程环境下========");
        //可以让线程休眠测试
        for (int i = 0; i < 10; i++) {
            new Thread(()->  System.out.println(Singleton.INSTANCE.hashCode() )).start();
        }
        
    }

}

enum Singleton {
    INSTANCE;
}