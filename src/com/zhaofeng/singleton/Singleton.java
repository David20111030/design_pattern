package com.zhaofeng.singleton;

/**
 * 饿汉模式，因为提供的方法都是静态方法，所有在类加载的时候，唯一的实例就会被加载，这种预先加载的单例模式叫做饿汉模式
 */
public class Singleton {

    /**
     * 将构造方法设置为私有方法
     */
    private Singleton(){}

    /**
     * 在类的内部调用构造方法，生成一个实例
     */
    private static Singleton instance = new Singleton();

    /**
     * 提供一个公共的方法，获取单实例
     */
    public static Singleton getInstance(){
        return instance;
    }
}
