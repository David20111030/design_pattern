package com.zhaofeng.adapter.objectAdapter;

/**
 * Created by zhaofeng on 2016/10/24.
 */
public class Adapter implements Target {

    private Adaptee mAdaptee;

    public Adapter(Adaptee adaptee) {
        mAdaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        mAdaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        System.out.println("sampleOperation2");
    }
}
