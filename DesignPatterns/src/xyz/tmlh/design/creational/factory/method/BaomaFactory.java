package xyz.tmlh.design.creational.factory.method;

import xyz.tmlh.design.creational.factory.simple.Baoma;
import xyz.tmlh.design.creational.factory.simple.Car;

public class BaomaFactory implements AbsFactory{

	public Car createCar() {
		return new Baoma();
	}

}