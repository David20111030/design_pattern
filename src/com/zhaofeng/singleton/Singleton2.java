package com.zhaofeng.singleton;

/**
 * 懒汉模式
 **/
public class Singleton2 {

    /**
     * 1.将构造方法设置为私有方法
     */
    private Singleton2() {
    }

    /**
     * 2.在类的内部声明一个实例，但是不调用构造方法
     */
    private static Singleton2 instance;

//    /**
//     * 3.提供一个公共的方法，获取单实例，判断instance是否为空，如果为空，则调用构造方法创建实例
//     */
//    public static Singleton2 getInstance() {
//        if (instance == null) {
//            instance = new Singleton2();
//        }
//        return instance;
//    }

//    /**
//     * 在getInstance方法上面加同步synchronized，在方法调用上加了同步，虽* 然线程安全了，但是每次都要同步，会影响性能，毕竟99%的情况下是不需* 要同步的
//     */
//    public static synchronized Singleton2 getInstance(){
//        if(instance == null){
//            instance = new Singleton2();
//        }
//        return instance;
//    }

    /**
     * 双重检查锁定，在getInstance中做了两次null检查，确保了只有第一次调* 用单例的时候才会做同步，这样也是线程安全的，同时避免了每次都同步的性能损耗
     */
    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
