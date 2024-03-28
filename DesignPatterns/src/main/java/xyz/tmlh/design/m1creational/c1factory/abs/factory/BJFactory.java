package xyz.tmlh.design.m1creational.c1factory.abs.factory;

import xyz.tmlh.design.m1creational.c1factory.abs.car.BJBaomaCar;
import xyz.tmlh.design.m1creational.c1factory.abs.car.BJBenchiCar;
import xyz.tmlh.design.m1creational.c1factory.abs.car.Car;

// 北京汽车生产工厂
public class BJFactory implements AbsFactory{

    @Override
	public Car createCar(String type) {
        Car car = null;
        
        if ("奔驰".equals(type)) {
            return new BJBenchiCar();
        } else if ("宝马".equals(type)) {
            return new BJBaomaCar();
        }
        
        return car;
	}

}