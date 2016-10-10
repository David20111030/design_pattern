package com.zhaofeng.factory.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/10
 * Time: 14:14
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.produceCar();

        FactoryB factoryB = new FactoryB();
        factoryB.produceTv();
    }
}
