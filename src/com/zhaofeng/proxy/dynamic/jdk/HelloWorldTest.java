package com.zhaofeng.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/13
 * Time: 10:30
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldTest {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorldImpl();
        InvocationHandler invocationHandler = new HelloWorldHandler(helloWorld);
        HelloWorld proxy = (HelloWorld) Proxy.newProxyInstance(helloWorld.getClass().getClassLoader(), helloWorld.getClass().getInterfaces(), invocationHandler);
        proxy.sayHello();
    }
}
