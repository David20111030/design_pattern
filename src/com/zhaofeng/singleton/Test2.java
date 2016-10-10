package com.zhaofeng.singleton;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/10
 * Time: 15:31
 * To change this template use File | Settings | File Templates.
 */
public class Test2 {
    public static void main(String[] args){
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
