package com.zhaofeng.proxy.dynamic.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/13
 * Time: 10:27
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldHandler implements InvocationHandler {

    private Object object;

    public HelloWorldHandler(Object obj) {
        super();
        this.object = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        doBefore();
        result = method.invoke(object, args);
        doAfter();
        return result;
    }

    private void doAfter() {
        System.out.println("after method invoke...");
    }

    private void doBefore() {
        System.out.println("before method invoke...");
    }
}
