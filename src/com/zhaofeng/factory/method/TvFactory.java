package com.zhaofeng.factory.method;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/10
 * Time: 13:54
 * To change this template use File | Settings | File Templates.
 */
public class TvFactory implements Factory {
    @Override
    public Product produce() {
        return new Tv();
    }
}
