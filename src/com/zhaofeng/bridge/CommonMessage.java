package com.zhaofeng.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/26
 * Time: 15:03
 * To change this template use File | Settings | File Templates.
 */
public class CommonMessage extends AbstractMessage {
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    public void sendMessage(String message, String toUser) {
        //对于普通消息，什么都不干，直接调父类的方法，把消息发送出去就可以了
        super.sendMessage(message, toUser);
    }
}
