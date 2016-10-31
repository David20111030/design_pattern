package com.zhaofeng.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/31
 * Time: 9:37
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void operation() {
        super.operation();
        AddedBehavior();
    }

    public void AddedBehavior() {
        System.out.println("add behavior");
    }
}
