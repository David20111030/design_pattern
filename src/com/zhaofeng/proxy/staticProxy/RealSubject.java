package com.zhaofeng.proxy.staticProxy;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/13
 * Time: 9:28
 * To change this template use File | Settings | File Templates.
 */
public class RealSubject implements Subject {
    @Override
    public void doSubject() {
        try {
            System.out.println("doing subject...");
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
