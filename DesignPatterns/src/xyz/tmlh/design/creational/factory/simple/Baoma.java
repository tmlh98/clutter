package xyz.tmlh.design.creational.factory.simple;
public class Baoma implements Car {

	@Override
	public void run() {
		System.out.println("宝马runing" + getClass().getSimpleName());
	}

}