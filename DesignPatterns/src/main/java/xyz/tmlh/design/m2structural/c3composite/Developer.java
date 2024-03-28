package xyz.tmlh.design.m2structural.c3composite;

/**
 * @author Levin
 * @create 2017/11/10 0010
 */
public class Developer implements Employee {

    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee employee) {
        //叶子节点，该方法不适用于当前类
    }

    @Override
    public void remove(Employee employee) {
        //叶子节点，该方法不适用于当前类
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.print("Name = " + this.name);
        System.out.println("\t\tSalary = " + this.salary);
        System.out.println("-------------");
    }
}