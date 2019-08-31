package xyz.tmlh.design.creational.prototype;

import java.util.Date;

/** 
 * 原型模式测试：
 *克隆类似于new，但是不同于new。new创建新的对象属性采用的是默认值。克隆出的对象的属性值完全和原型对象相同。
 *并且克隆出的新对象改变不会影响原型对象。然后，再修改克隆对象的值
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep();
        Sheep friend = new Sheep();
        friend.setColor("black");
        friend.setName("tom");
        sheep.setColor("white");
        sheep.setName("sean");
        sheep.setFriend(friend);
        
        System.out.println(sheep);
        
        System.out.println(sheep.clone());
        
        System.out.println(sheep.getFriend().hashCode());
        System.out.println(((Sheep)sheep.clone()).getFriend().hashCode());
        
        System.out.println("深拷贝------------------------------1");
        DeepCloneableSheep sheep1 = new DeepCloneableSheep();
        DeepCloneableSheep friend1 = new DeepCloneableSheep();
        friend1.setColor("black");
        friend1.setName("tom");
        sheep1.setColor("white");
        sheep1.setName("sean");
        sheep1.setFriend(friend1);
        
        System.out.println(sheep1.getFriend().hashCode());
        System.out.println(((DeepCloneableSheep)sheep1.clone()).getFriend().hashCode());
        System.out.println("深拷贝------------------------------2");
        DeepCloneableSheep2 sheep2 = new DeepCloneableSheep2();
        sheep2.setColor("black");
        sheep2.setName("tom");
        Date date = new Date();
        sheep2.setDate(date);
        System.out.println(sheep2);
        System.out.println(sheep2.deepClone());
        
        System.out.println(date.hashCode());
        System.out.println(sheep2.deepClone().hashCode());
        
    }
    
}
