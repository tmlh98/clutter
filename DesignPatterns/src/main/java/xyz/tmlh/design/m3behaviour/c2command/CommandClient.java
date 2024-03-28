package xyz.tmlh.design.m3behaviour.c2command;

import java.util.ArrayList;
import java.util.List;

/**
 * 主要涉及到以下几个核心角色：
 * <p>
 * 命令（Command）:
 * 定义了执行操作的接口，通常包含一个 execute 方法，用于调用具体的操作。
 * <p>
 * 具体命令（ConcreteCommand）:
 * 实现了命令接口，负责执行具体的操作。它通常包含了对接收者的引用，通过调用接收者的方法来完成请求的处理。
 * <p>
 * 接收者（Receiver）:
 * 知道如何执行与请求相关的操作，实际执行命令的对象。
 * <p>
 * 调用者/请求者（Invoker）:
 * 发送命令的对象，它包含了一个命令对象并能触发命令的执行。调用者并不直接处理请求，而是通过将请求传递给命令对象来实现。
 * <p>
 * 客户端（Client）:
 * 创建具体命令对象并设置其接收者，将命令对象交给调用者执行
 */
public class CommandClient {
    public static void main(String[] args) {
        //步骤 5
        //使用 Broker 类来接受并执行命令。
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}

//步骤 1
//创建一个命令接口。
interface Order {
    void execute();
}
//步骤 2
//创建一个请求类。
class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ",Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ",Quantity: " + quantity + " ] sold");
    }
}
//步骤 3
//创建实现了 Order 接口的实体类。
class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
//步骤 4
//创建命令调用类。
class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}


