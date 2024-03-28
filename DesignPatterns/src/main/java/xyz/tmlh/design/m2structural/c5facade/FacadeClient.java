package xyz.tmlh.design.m2structural.c5facade;

/**
 * 外观模式涉及以下核心角色：
 * <p>
 * 外观（Facade）:
 * 提供一个简化的接口，封装了系统的复杂性。外观模式的客户端通过与外观对象交互，而无需直接与系统的各个组件打交道。
 * <p>
 * 子系统（Subsystem）:
 * 由多个相互关联的类组成，负责系统的具体功能。外观对象通过调用这些子系统来完成客户端的请求。
 * <p>
 * 客户端（Client）:
 * 使用外观对象来与系统交互，而不需要了解系统内部的具体实现。
 */
public class FacadeClient {
    public static void main(String[] args) {
        //步骤 4
        //使用该外观类画出各种类型的形状。
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
//步骤 1
//创建一个接口。
interface Shape {
    void draw();
}

//步骤 2
//创建实现接口的实体类。
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
//正方形
class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
//步骤 3
//创建一个外观类。
class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
