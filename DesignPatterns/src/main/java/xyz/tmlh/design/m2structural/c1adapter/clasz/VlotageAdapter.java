package xyz.tmlh.design.m2structural.c1adapter.clasz;

import xyz.tmlh.design.m2structural.c1adapter.Vlotage220V;
import xyz.tmlh.design.m2structural.c1adapter.Vlotage5V;

/** 
 *
 * @Author TianXin 
 * @Date 2019年9月1日 
 */
public class VlotageAdapter extends Vlotage220V implements Vlotage5V{

    @Override
    public int output5V() {
       int output220v = output220V();
       System.out.println("电压为: " + output220v);
       int v5 = output220v / 44;
       System.out.println("转化" + v5 + "V");
        return v5;
    }

}
