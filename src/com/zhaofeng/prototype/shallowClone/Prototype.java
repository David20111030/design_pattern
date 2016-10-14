package com.zhaofeng.prototype.shallowClone;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/14
 * Time: 11:38
 * To change this template use File | Settings | File Templates.
 */
public abstract class Prototype implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
