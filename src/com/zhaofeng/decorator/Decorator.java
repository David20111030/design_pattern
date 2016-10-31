package com.zhaofeng.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/31
 * Time: 9:29
 * To change this template use File | Settings | File Templates.
 */
public class Decorator implements Component {
    // 持有一个 Component 对象，和 Component 形成聚合关系
    protected Component component;

    // 传入要进一步修饰的对象
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
