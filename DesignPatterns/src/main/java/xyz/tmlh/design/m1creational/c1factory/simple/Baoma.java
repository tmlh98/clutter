package xyz.tmlh.design.m1creational.c1factory.simple;
public class Baoma implements Car {

	@Override
	public void run() {
		System.out.println("宝马runing" + getClass().getSimpleName());
	}

}