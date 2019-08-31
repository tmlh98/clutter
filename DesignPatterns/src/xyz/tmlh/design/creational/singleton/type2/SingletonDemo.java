package xyz.tmlh.design.creational.singleton.type2;

/*
 *1）单例对象延迟加载，真正用的时候才加载
 *2）资源利用率高了，但是每次调用 getInstance() 方法都要同步，并发效率较低
 */
public class SingletonDemo {
    
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1);
        System.out.println(singleton2);
        
        System.out.println("=======多线程环境下========");
    }

}
//懒汉式
class Singleton{
    private Singleton() {}
    
    private static Singleton singleton;
    
    public static synchronized Singleton getInstance(){
        if(singleton  == null) {
            singleton = new Singleton();
        }
        
        return singleton;
    }
    
}