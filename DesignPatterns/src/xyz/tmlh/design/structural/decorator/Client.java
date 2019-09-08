package xyz.tmlh.design.structural.decorator;

/**
 *
 * @Author TianXin
 * @Date 2019年9月8日
 */
public class Client {
    public static void main(String[] args) {

        Drink order = new DeCaf();
        System.out.println(order.getDescription() +" price : "+ order.cost());
        
        
        order = new Milk(order);
        System.out.println(order.getDescription() +" price : "+ order.cost());
        
        order = new Chocolate(order);
        System.out.println(order.getDescription() +" price : "+ order.cost());
    }
}
