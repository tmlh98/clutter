package xyz.tmlh.design.structural.decorator;

/** 
 *
 * @Author TianXin 
 * @Date 2019年9月8日 
 */
public class Coffee  extends Drink{

    @Override
    public float cost() {
        return getPrice();
    }

}
