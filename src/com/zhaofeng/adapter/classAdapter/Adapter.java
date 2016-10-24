package com.zhaofeng.adapter.classAdapter;

/**
 * Created by zhaofeng on 2016/10/24.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void sampleOperation2() {
        System.out.println("sampleOperation2");
    }
}
