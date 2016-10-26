package com.zhaofeng.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/26
 * Time: 15:02
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractMessage {
    protected MessageImplementor impl;

    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    public void sendMessage(String message, String toUser) {
        this.impl.send(message, toUser);
    }
}
