package xyz.tmlh.design.m1creational.c4builder.builder;

/** 
 * 普通房子
 * @Author TianXin 
 * @Date 2019年9月1日 
 */
public class CommonHouseBuilder extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println(getClass().getSimpleName() + " buildBasic " );
        house.setBasic("普通地基");
    }

    @Override
    public void buildWall() {
        System.out.println(getClass().getSimpleName() + " buildWall " );
        house.setWall("普通墙壁");
    }

    @Override
    public void buildRoffed() {
        
        System.out.println(getClass().getSimpleName() + " buildRoffed " );
        house.setRoofed("普通房顶");
    }

}
