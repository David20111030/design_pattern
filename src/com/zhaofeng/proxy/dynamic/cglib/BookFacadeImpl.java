package com.zhaofeng.proxy.dynamic.cglib;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/13
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 */
public class BookFacadeImpl implements BookFacade {
    @Override
    public void addBook() {
        System.out.println("新增图书...");
    }
}
