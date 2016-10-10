package com.zhaofeng.singleton;

/**
 * 静态内部类，利用了classloader的机制来保证初始化instance时只有一个线程，所以也是线程安全的
 */
public class Singleton3 {
    private static class LazyHolder {
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    private Singleton3() {
    }

    public static final Singleton3 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
