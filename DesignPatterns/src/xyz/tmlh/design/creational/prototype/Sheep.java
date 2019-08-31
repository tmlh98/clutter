package xyz.tmlh.design.creational.prototype;
//克隆羊（浅拷贝）
/*
 * 原型模式实现
实现Cloneable接口和clone方法
Prototype模式中实现起来最困难的地方就是内存复制操作，所幸在Java中提供了clone()方法替我们做了绝大部分事情
 */
public class Sheep implements Cloneable{

    private String name;
    private String color;
    
    // friend对象不会克隆，而是将对象指针指向source对象的地址
    private Sheep friend;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
     
     
    
    public Sheep getFriend() {
        return friend;
    }
    public void setFriend(Sheep friend) {
        this.friend = friend;
    }
    @Override
    public String toString() {
        return "Sheep [name=" + name + ", color=" + color + ", friend=" + friend + "]";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
