package xyz.tmlh.design.m1creational.c4builder.product;

/** 
 *  房子（Product）
 */
public class House {

    //地基
    private String basic;
    //墙
    private String wall;
    //屋顶
    private String roofed;
    public String getBasic() {
        return basic;
    }
    public void setBasic(String basic) {
        this.basic = basic;
    }
    public String getWall() {
        return wall;
    }
    public void setWall(String wall) {
        this.wall = wall;
    }
    public String getRoofed() {
        return roofed;
    }
    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
    @Override
    public String toString() {
        return "House [basic=" + basic + ", wall=" + wall + ", roofed=" + roofed + "]";
    }
}
