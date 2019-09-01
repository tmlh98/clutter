package xyz.tmlh.design.structural.adapter.obj;

import xyz.tmlh.design.structural.adapter.Vlotage220V;
import xyz.tmlh.design.structural.adapter.Vlotage5V;

/** 
 *
 * @Author TianXin 
 * @Date 2019年9月1日 
 */
public class VlotageAdapter implements Vlotage5V{
    
    private Vlotage220V vlotage220V;

    public VlotageAdapter(Vlotage220V vlotage220v) {
        this.vlotage220V = vlotage220v;
    }
    
    @Override
    public int output5V() {
       int output220v = vlotage220V.output220V();
       System.out.println("电压为: " + output220v);
       int v5 = output220v / 44;
       System.out.println("转化" + v5 + "V");
        return v5;
    }

}
