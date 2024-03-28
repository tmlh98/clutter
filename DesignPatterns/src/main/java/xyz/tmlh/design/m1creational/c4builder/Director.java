package xyz.tmlh.design.m1creational.c4builder;


import xyz.tmlh.design.m1creational.c4builder.product.House;
import xyz.tmlh.design.m1creational.c4builder.builder.HouseBuilder;

/**
 *
 * @Author TianXin 
 * @Date 2019年9月1日 
 */
public class Director {

    private HouseBuilder builder;
    
    public Director(HouseBuilder builder) {
        this.builder = builder;
    }
    
    
    public House director() {
        builder.buildBasic();
        builder.buildWall();
        builder.buildRoffed();
        return builder.getHouse();
    }
    
}
