package com.zhaofeng.proxy.staticProxy;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/13
 * Time: 9:30
 * To change this template use File | Settings | File Templates.
 */
public class TimeProxy implements Subject {
    private Subject realSubject;

    public TimeProxy(RealSubject r) {
        super();
        this.realSubject = r;
    }

    @Override
    public void doSubject() {
        System.out.println("start...");
        long start = System.currentTimeMillis();
        realSubject.doSubject();
        System.out.println("end...costing " + (System.currentTimeMillis() - start) + " ms");
    }
}
