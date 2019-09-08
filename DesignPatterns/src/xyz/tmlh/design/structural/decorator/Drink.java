package xyz.tmlh.design.structural.decorator;

/** 
 *
 * @Author TianXin 
 * @Date 2019年9月8日 
 */
public abstract class Drink {
    
    private String description;
    
    private float price ;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    /**
     * 计算价格
     */
    public abstract float cost();

}
