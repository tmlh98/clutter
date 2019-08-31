package xyz.tmlh.design.creational.factory.abs;

import xyz.tmlh.design.creational.factory.abs.car.Car;
import xyz.tmlh.design.creational.factory.abs.factory.AbsFactory;
import xyz.tmlh.design.creational.factory.abs.factory.BJFactory;

public class Client {
    public static void main(String[] args) {
        AbsFactory factory = new BJFactory();
        Car car = factory.createCar("宝马");
        car.run();
    }
}