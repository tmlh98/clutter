package xyz.tmlh.design.m1creational.c1factory.abs.factory;

import xyz.tmlh.design.m1creational.c1factory.abs.car.Car;

public interface AbsFactory {
    
    Car createCar(String type) ;
    
}
