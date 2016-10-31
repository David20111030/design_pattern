package com.zhaofeng.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/31
 * Time: 9:30
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteDecoratorA extends Decorator {
    private String addedState = "new feature 1";

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        System.out.println("add feature 1: " + addedState);
    }
}
