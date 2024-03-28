package xyz.tmlh.design.m1creational.c4builder.builder;

/** 
 * 高楼
 * @Author TianXin 
 * @Date 2019年9月1日 
 */
public class HighHouseBuilder extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println(getClass().getSimpleName() + " buildBasic " );
        house.setBasic("高楼地基");
    }

    @Override
    public void buildWall() {
        System.out.println(getClass().getSimpleName() + " buildWall " );
        house.setWall("高楼墙壁");
    }

    @Override
    public void buildRoffed() {
        
        System.out.println(getClass().getSimpleName() + " buildRoffed " );
        house.setRoofed("高楼房顶");
    }

}
