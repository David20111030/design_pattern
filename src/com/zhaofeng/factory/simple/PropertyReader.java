package com.zhaofeng.factory.simple;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/10
 * Time: 10:51
 * To change this template use File | Settings | File Templates.
 */
public class PropertyReader {
    public static Map<String, String> map = new HashMap<>();

    public Map<String, String> readPropertyFile(String fileName) {
        Properties pro = new Properties();
        InputStream in = getClass().getResourceAsStream(fileName);
        try {
            pro.load(in);
            Iterator<String> iterator = pro.stringPropertyNames().iterator();
            while (iterator.hasNext()) {
                String key = iterator.next();
                String value = pro.getProperty(key);
                map.put(key, value);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}
