package com.zhaofeng.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/31
 * Time: 9:38
 * To change this template use File | Settings | File Templates.
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();

        System.out.println("======================================");
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();

        System.out.println("======================================");
        Decorator decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.operation();
    }
}
