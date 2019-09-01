package xyz.tmlh.design.creational.builder;


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
