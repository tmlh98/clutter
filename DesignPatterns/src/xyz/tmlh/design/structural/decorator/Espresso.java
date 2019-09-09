package xyz.tmlh.design.structural.decorator;

/** 
 *
 * @Author TianXin 
 * @Date 2019年9月8日 
 */
public class Espresso extends Coffee{

    public Espresso() {
        setDescription(getClass().getSimpleName());
        setPrice(1.1f);
    }
    
}
