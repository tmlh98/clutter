package xyz.tmlh.design.creational.factory.simple;
public class Client {

	public static void main(String[] args) {
		Car c1 = CarFactory.createCar("奔驰");
		Car c2 = CarFactory.createCar("宝马");
		
		c1.run();
		c2.run();
	}

}