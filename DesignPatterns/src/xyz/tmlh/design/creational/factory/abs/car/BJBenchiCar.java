package xyz.tmlh.design.creational.factory.abs.car;

public class BJBenchiCar implements Car {

    @Override
    public void run() {
        System.out.println(getClass().getSimpleName());
    }

}
