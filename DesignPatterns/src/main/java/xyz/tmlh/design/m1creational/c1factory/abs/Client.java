package xyz.tmlh.design.m1creational.c1factory.abs;

import xyz.tmlh.design.m1creational.c1factory.abs.car.Car;
import xyz.tmlh.design.m1creational.c1factory.abs.factory.AbsFactory;
import xyz.tmlh.design.m1creational.c1factory.abs.factory.BJFactory;

public class Client {
    public static void main(String[] args) {
        AbsFactory factory = new BJFactory();
        Car car = factory.createCar("宝马");
        car.run();
    }
}