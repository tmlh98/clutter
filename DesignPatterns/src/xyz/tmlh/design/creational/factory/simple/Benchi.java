package xyz.tmlh.design.creational.factory.simple;

public class Benchi implements Car {

    @Override
    public void run() {
        System.out.println("奔驰runing"+ getClass().getSimpleName());
    }

}