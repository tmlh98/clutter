package xyz.tmlh.design.creational.factory.method;

import xyz.tmlh.design.creational.factory.simple.Benchi;
import xyz.tmlh.design.creational.factory.simple.Car;

public class BenchiFactory implements AbsFactory{

	public Car createCar() {
		return new Benchi();
	}

}