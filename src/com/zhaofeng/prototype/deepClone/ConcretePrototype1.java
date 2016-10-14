package com.zhaofeng.prototype.deepClone;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/14
 * Time: 11:43
 * To change this template use File | Settings | File Templates.
 */
public class ConcretePrototype1 implements Prototype {
    @Override
    public Object clone() {
        // 最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
