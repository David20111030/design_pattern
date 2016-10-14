package com.zhaofeng.prototype;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/14
 * Time: 11:39
 * To change this template use File | Settings | File Templates.
 */
public class ConcretePrototype1 extends Prototype {
    public static int classFlag = 1;

    /**
     * 克隆自身方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        return (ConcretePrototype1) super.clone();
    }
}
