/*
♥简单工厂模式
用来生产同一等级结构中的任意产品。对于增加新的产品，需要修改已有代码
♥工厂方法模式
用来生产同一等级结构中的固定产品。支持增加任意产品.

    1)更符合开-闭原则
    新增一种产品时，只需要增加相应的具体产品类和相应的工厂子类即可
    简单工厂模式需要修改工厂类的判断逻辑
    
    2)符合单一职责原则
    每个具体工厂类只负责创建对应的产品
    简单工厂中的工厂类存在复杂的switch逻辑判断
    
    3)不使用静态工厂方法，可以形成基于继承的等级结构。
    简单工厂模式的工厂类使用静态工厂方法
♥抽象工厂模式
用来生产不同产品族的全部产品。对于增加新的产品，无能为力，支持增加产品族
 */
package xyz.tmlh.design.creational.factory;