package com.zhaofeng.adapter.objectAdapter;

/**
 * Created by zhaofeng on 2016/10/24.
 */
public class MyClass {
    public static void main(String[] args) {
        Adapter adapter =new Adapter(new Adaptee());
        adapter.sampleOperation1();
        adapter.sampleOperation2();
    }
}
