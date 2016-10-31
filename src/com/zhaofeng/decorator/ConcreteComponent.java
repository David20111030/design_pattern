package com.zhaofeng.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/31
 * Time: 9:28
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("init operation...");
    }
}
