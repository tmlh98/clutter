package xyz.tmlh.design.creational.factory.abs.car;

public class BJBaomaCar implements Car {

    @Override
    public void run() {
        System.out.println(getClass().getSimpleName());
    }

}
