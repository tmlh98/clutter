package xyz.tmlh.design.m1creational.c1factory.simple;


//工厂类方法(简单工厂模式又叫静态工厂模式)
public class CarFactory {
	
	public static Car createCar(String type) {
		Car car = null;
		
		if ("奔驰".equals(type)) {
			return new Benchi();
		} else if ("宝马".equals(type)) {
			return new Baoma();
		}
		
		return car;
	}
	
}