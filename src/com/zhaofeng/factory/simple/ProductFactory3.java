package com.zhaofeng.factory.simple;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/10
 * Time: 10:59
 * To change this template use File | Settings | File Templates.
 */
public class ProductFactory3 {
    public static Product produce(String key) throws Exception {
        PropertyReader reader = new PropertyReader();
        Map<String, String> map = reader.readPropertyFile("product.properties");
        try {
            Product product = (Product) Class.forName(map.get(key)).newInstance();
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
