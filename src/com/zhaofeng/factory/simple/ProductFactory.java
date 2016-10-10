package com.zhaofeng.factory.simple;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/10
 * Time: 10:21
 * To change this template use File | Settings | File Templates.
 */
public class ProductFactory {
    public static Product produce(String productName) throws Exception {
        switch (productName) {
            case "tv":
                return new Tv();
            case "car":
                return new Car();
            default:
                throw new Exception("没有该产品");
        }
    }
}
