package xyz.tmlh.design.m1creational.c1factory.method;

import xyz.tmlh.design.m1creational.c1factory.simple.Baoma;
import xyz.tmlh.design.m1creational.c1factory.simple.Car;

public class BaomaFactory implements AbsFactory{

	public Car createCar() {
		return new Baoma();
	}

}