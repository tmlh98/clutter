package xyz.tmlh.design.m1creational.c2singleton.type1;

/** 
 *  饿汉式
 */
/*
缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。
如果从始 至终从未使用过这个实例，则会造成内存的浪费
2) 这种方式基于classloder机制避免了多线程的同步问题，
不过，instance在类装载 时就实例化，在单例模式中大多数都是调用getInstance方法，
 但是导致类装载 的原因有很多种，因此不能确定有其他的方式（或者其他的静态方法）导致类 装载，
 这时候初始化instance就没有达到lazy loading的效果
 */
public class SingletonDemo{
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
//静态变量法
class Singleton{
    private Singleton(){}
    
    private static final Singleton SINGLETON = new Singleton();
    
    public static Singleton getInstance(){
        return SINGLETON;
    }
}
//静态变量法
class Singleton_2{
    private Singleton_2(){}
    
    private static Singleton_2 SINGLETON;
    
    {
        SINGLETON = new Singleton_2();
    }
    
    public static Singleton_2 getInstance(){
        return SINGLETON;
    }
}