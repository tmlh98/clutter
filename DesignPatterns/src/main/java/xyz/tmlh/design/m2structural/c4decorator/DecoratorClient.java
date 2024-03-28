package xyz.tmlh.design.m2structural.c4decorator;


/*
装饰器模式包含以下几个核心角色：

抽象组件（Component）：定义了原始对象和装饰器对象的公共接口或抽象类，可以是具体组件类的父类或接口。
具体组件（Concrete Component）：是被装饰的原始对象，它定义了需要添加新功能的对象。
抽象装饰器（Decorator）：继承自抽象组件，它包含了一个抽象组件对象，并定义了与抽象组件相同的接口，同时可以通过组合方式持有其他装饰器对象。
具体装饰器（Concrete Decorator）：实现了抽象装饰器的接口，负责向抽象组件添加新的功能。具体装饰器通常会在调用原始对象的方法之前或之后执行自己的操作。
 */
public class DecoratorClient {

    //步骤 5
    //使用 RedShapeDecorator 来装饰 Shape 对象。
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}


//步骤 1
//创建一个接口：
/**
 * 形状
 */
interface Shape {
    /**
     * 画出形状
     */
    void draw();
}

//步骤 2
//创建实现接口的实体类。
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle 长方形");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle 圆形");
    }
}

//步骤 3
//创建实现了 Shape 接口的抽象装饰类。
abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}

//步骤 4
//创建扩展了 ShapeDecorator 类的实体装饰类。
class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    /**
     * 设置形状边框为红色。
     * 该方法将指定形状的边框颜色设置为红色，但方法当前仅打印边框颜色信息。
     *
     * @param decoratedShape 被装饰的形状对象，该方法当前未使用此参数。
     */
    private void setRedBorder(Shape decoratedShape) {
        // 打印边框颜色信息
        System.out.println("Border Color: Red");
    }
}
