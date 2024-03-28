package xyz.tmlh.design.m2structural.c3composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理者类
 *
 * @author Levin
 * @create 2017/11/10 0010
 */
public class Manager implements Employee {
    private String name;
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    private List<Employee> employees = new ArrayList<>();

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void print() {
        System.out.println("-------------");
        System.out.print("Name = " + this.name);
        System.out.println("\t\tSalary = " + this.salary);
        System.out.println("-------------");

        for (Employee employee : employees) {
            employee.print();
        }
    }
}
