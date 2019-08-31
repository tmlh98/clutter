package xyz.tmlh.design.creational.factory.abs.factory;

import xyz.tmlh.design.creational.factory.abs.car.Car;

public interface AbsFactory {
    
    Car createCar(String type) ;
    
}
