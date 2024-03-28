package xyz.tmlh.design.m1creational.c1factory.abs.car;

public class BJBenchiCar implements Car {

    @Override
    public void run() {
        System.out.println(getClass().getSimpleName());
    }

}
