package xyz.tmlh.design.m1creational.c1factory.abs.factory;

import xyz.tmlh.design.m1creational.c1factory.abs.car.Car;
import xyz.tmlh.design.m1creational.c1factory.abs.car.DJBaomaCar;
import xyz.tmlh.design.m1creational.c1factory.abs.car.DJBenchiCar;

//东京汽车生成工厂
public class DJCarFactory implements AbsFactory{
    @Override
	public Car createCar(String type) {
        Car car = null;
        
        if ("奔驰".equals(type)) {
            return new DJBenchiCar();
        } else if ("宝马".equals(type)) {
            return new DJBaomaCar();
        }
        
        return car;
	}

}