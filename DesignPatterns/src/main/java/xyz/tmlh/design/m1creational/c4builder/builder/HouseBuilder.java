package xyz.tmlh.design.m1creational.c4builder.builder;

import xyz.tmlh.design.m1creational.c4builder.product.House;

/**
 *
 */
public abstract class HouseBuilder {

    protected House house = new House();
    
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void buildRoffed();
    
    public House getHouse() {
        return house;
    }
    
    
}
