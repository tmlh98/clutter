package xyz.tmlh.design.m1creational.c1factory.abs.car;

public class BJBaomaCar implements Car {

    @Override
    public void run() {
        System.out.println(getClass().getSimpleName());
    }

}
