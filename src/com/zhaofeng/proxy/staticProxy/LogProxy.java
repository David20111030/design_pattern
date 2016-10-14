package com.zhaofeng.proxy.staticProxy;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/13
 * Time: 9:35
 * To change this template use File | Settings | File Templates.
 */
public class LogProxy implements Subject {
    public LogProxy(Subject r) {
        super();
        this.r = r;
    }

    private Subject r;

    @Override
    public void doSubject() {
        System.out.println("log start...");
        r.doSubject();
        System.out.println("log end...");
    }
}
