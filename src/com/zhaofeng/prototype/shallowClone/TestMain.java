package com.zhaofeng.prototype.shallowClone;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/14
 * Time: 11:40
 * To change this template use File | Settings | File Templates.
 */
public class TestMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype1 = new ConcretePrototype1();
        ConcretePrototype1 concretePrototype1 = (ConcretePrototype1) prototype1.clone();
        System.out.println(concretePrototype1.classFlag);
        Prototype prototype2 = new ConcretePrototype2();
        ConcretePrototype2 concretePrototype2 = (ConcretePrototype2) prototype2.clone();
        System.out.println(concretePrototype2.classFlag);
    }
}