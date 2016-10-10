package com.zhaofeng.factory.abstractFactory;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/10
 * Time: 14:14
 * To change this template use File | Settings | File Templates.
 */
public class FactoryB implements Factory {

    @Override
    public Tv produceTv() {
        return new Sony();
    }

    @Override
    public Car produceCar() {
        return new Audi();
    }
}
