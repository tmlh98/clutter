package xyz.tmlh.design.m2structural.c1adapter;

/** 
 *
 * @Author TianXin 
 * @Date 2019年9月1日 
 */
public class Phone {

    public void charging (Vlotage5V vlotage) {
        int output5v = vlotage.output5V();
        System.out.println("正在充电，电压为: " + output5v + "V");
        
    }
    
    
    
}
