package com.zhaofeng.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/12
 * Time: 17:36
 * To change this template use File | Settings | File Templates.
 */
public abstract class Product {
    protected List<String> parts = new ArrayList<String>();

    //添加部件
    public void add(String part){
        parts.add(part);
    }

    //显示产品信息
    public void show(){
        System.out.print("产品部件信息：");
        for(String part : parts){
            System.out.print(part + "\t");
        }
    }
}
