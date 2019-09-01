package xyz.tmlh.design.creational.builder;

/*
 *  建造者模式的四个角色
1) Product (产品角色) : - 一个具体的产品对象。
2) Builder (抽象建造者) :创建一个Product对象的各个部件指定的接口/抽象类。
3) ConcreteBuilder (具体建造者) :实现接口， 构建和装配各个部件。
4) Director (指挥者) :构建一个使用Builder接口的对象。它主要是用于创建-一个复杂的对象。它主要有两个作
用，一是:隔离了客户与对象的生产过程，二是:负责控制产品对象的生产过程。
 */
public class Client {

    public static void main(String[] args) {
        HouseBuilder builder = new CommonHouseBuilder();
        Director director = new Director(builder);
        House house = director.director();
        System.out.println(house);
        
        House director2 = new Director(new HighHouseBuilder()).director();
        System.out.println(director2);
        
    }

}
