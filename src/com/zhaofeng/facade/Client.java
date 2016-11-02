package com.zhaofeng.facade;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/11/2
 * Time: 17:19
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.wrapOperation();
    }
}
