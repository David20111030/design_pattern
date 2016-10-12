package com.zhaofeng.builder;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/12
 * Time: 17:40
 * To change this template use File | Settings | File Templates.
 */
public class DellBuilder implements Builder {
    private Product product = new Dell();

    @Override
    public void buildCPU() {
        product.add("CUP: Intel 酷睿i7 3612QM");
    }

    @Override
    public void buildMemory() {
        product.add("内存: 8GB DDR3 1600MHz");
    }

    @Override
    public void buildDisplayCard() {
        product.add("显卡: NVIDIA GeForce GT 640M＋Intel GMA HD 4000");
    }

    @Override
    public Product getFinalResult() {
        return product;
    }
}
