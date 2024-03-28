package xyz.tmlh.design.m1creational.c1factory.method;

import xyz.tmlh.design.m1creational.c1factory.simple.Car;

public class Client {
    public static void main(String[] args) {
        Car c1 = new BenchiFactory().createCar();
        c1.run();
        
        Car c2 = new BaomaFactory().createCar();
        c2.run();
        
    }
}