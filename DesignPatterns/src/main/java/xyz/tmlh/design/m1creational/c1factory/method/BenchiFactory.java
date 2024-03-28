package xyz.tmlh.design.m1creational.c1factory.method;

import xyz.tmlh.design.m1creational.c1factory.simple.Benchi;
import xyz.tmlh.design.m1creational.c1factory.simple.Car;

public class BenchiFactory implements AbsFactory{

	public Car createCar() {
		return new Benchi();
	}

}