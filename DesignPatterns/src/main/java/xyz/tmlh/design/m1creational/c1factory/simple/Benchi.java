package xyz.tmlh.design.m1creational.c1factory.simple;

public class Benchi implements Car {

    @Override
    public void run() {
        System.out.println("奔驰runing"+ getClass().getSimpleName());
    }

}