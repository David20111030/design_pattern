package com.zhaofeng.proxy.staticProxy;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/13
 * Time: 9:32
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        TimeProxy timeProxy = new TimeProxy(realSubject);
        LogProxy logProxy = new LogProxy(timeProxy);
        logProxy.doSubject();
    }
}
