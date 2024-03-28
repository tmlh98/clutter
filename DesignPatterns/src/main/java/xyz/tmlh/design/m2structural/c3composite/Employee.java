package xyz.tmlh.design.m2structural.c3composite;

/**
 * 员工接口/也可以是抽象类
 *
 * @author Levin
 */
public interface Employee {

    void add(Employee employee);

    void remove(Employee employee);

    void print();
}
