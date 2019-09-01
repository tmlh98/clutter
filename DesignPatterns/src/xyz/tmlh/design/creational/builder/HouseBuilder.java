package xyz.tmlh.design.creational.builder;

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
