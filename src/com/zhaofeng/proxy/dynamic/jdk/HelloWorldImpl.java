package com.zhaofeng.proxy.dynamic.jdk;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/13
 * Time: 10:26
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldImpl implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}
