package xyz.tmlh.design.m2structural.c1adapter.clasz;

import xyz.tmlh.design.m2structural.c1adapter.Phone;

/**
 * 类适配器Test
 *
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VlotageAdapter());
    }
}
