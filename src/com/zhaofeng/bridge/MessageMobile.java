package com.zhaofeng.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/26
 * Time: 15:05
 * To change this template use File | Settings | File Templates.
 */
public class MessageMobile implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用手机短消息的方式，发送消息'" + message + "'给" + toUser);
    }
}
