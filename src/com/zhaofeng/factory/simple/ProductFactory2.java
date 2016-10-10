package com.zhaofeng.factory.simple;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/10
 * Time: 10:24
 * To change this template use File | Settings | File Templates.
 */
public class ProductFactory2 {
    public static Product produce(String className) throws Exception {
        try {
            Product product = (Product) Class.forName(className).newInstance();
            return product;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new Exception("没有该产品");
    }
}
