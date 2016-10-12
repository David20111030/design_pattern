package com.zhaofeng.builder;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/12
 * Time: 17:39
 * To change this template use File | Settings | File Templates.
 */
public interface Builder {
    //CUP
    public void buildCPU();

    //内存
    public void buildMemory();

    //显卡
    public void buildDisplayCard();

    //最终产品
    public Product getFinalResult();
}
