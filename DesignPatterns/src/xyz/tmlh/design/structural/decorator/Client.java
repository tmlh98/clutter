package xyz.tmlh.design.structural.decorator;

/*
 * 装饰模式职责
动态地为一个对象增加新的功能
装饰模式是一种用于代替继承的技术，无须通过继承增加子类就能扩展对象的新功能。使用对象的关联关系代替继承关系，更加灵活，同时避免类型体系的快读膨胀。


实现细节
Component抽象组件角色：真实对象和装饰对象有相同的接口。这样，客户端对象就能够以与真实对象相同的方式同装饰对象交互。
ConcreteComponent 具体组件角色(真实对象)：如io流中的FileInputStream、FileOutputStream
Decorator装饰角色：持有一个抽象组件的引用。装饰对象接受所有客户端的请求，并把这些请求转发给真实的对象。这样，就能在真实对象调用前后增加新的功能。
ConcreteDecorator具体装饰角色：负责给构件对象增加新的责任。
 */
public class Client {
    public static void main(String[] args) {

        Drink order = new DeCaf();
        System.out.println(order.getDescription() +" price : "+ order.cost());
        
        
        order = new Milk(order);
        System.out.println(order.getDescription() +" price : "+ order.cost());
        
        order = new Chocolate(order);
        System.out.println(order.getDescription() +" price : "+ order.cost());
    }
}
