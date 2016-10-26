package com.zhaofeng.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/26
 * Time: 15:03
 * To change this template use File | Settings | File Templates.
 */
public class MessageEmail implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用Email的方式，发送消息'" + message + "'给" + toUser);
    }
}
