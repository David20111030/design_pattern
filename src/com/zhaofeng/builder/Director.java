package com.zhaofeng.builder;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/12
 * Time: 17:41
 * To change this template use File | Settings | File Templates.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildCPU();
        builder.buildMemory();
        builder.buildDisplayCard();
    }
}
