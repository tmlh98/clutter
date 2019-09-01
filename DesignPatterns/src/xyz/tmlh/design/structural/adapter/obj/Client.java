package xyz.tmlh.design.structural.adapter.obj;

import xyz.tmlh.design.structural.adapter.Phone;
import xyz.tmlh.design.structural.adapter.Vlotage220V;

/**
 * 类适配器Test
 *
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VlotageAdapter(new Vlotage220V()));
    }
}
