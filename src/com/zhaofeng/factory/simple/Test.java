package com.zhaofeng.factory.simple;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/10
 * Time: 10:22
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
//        try {
//            ProductFactory.produce("car");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            ProductFactory2.produce("com.zhaofeng.factory.simple.Tv");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ProductFactory3.produce("tv");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
