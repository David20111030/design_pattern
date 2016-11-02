package com.zhaofeng.facade;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/11/2
 * Time: 17:18
 * To change this template use File | Settings | File Templates.
 */
public class Facade {
    public void wrapOperation() {
        SystemA a = new SystemA();
        a.operationA();
        SystemB b = new SystemB();
        b.operationB();
        SystemC c = new SystemC();
        c.operationC();
    }
}
