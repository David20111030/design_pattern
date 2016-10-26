package com.zhaofeng.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/26
 * Time: 15:04
 * To change this template use File | Settings | File Templates.
 */
public class SpecialUrgencyMessage extends AbstractMessage {

    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    public void hurry(String messageId) {
        //执行催促的业务，发出催促的信息
    }

    public void sendMessage(String message, String toUser) {
        message = "特急：" + message;
        super.sendMessage(message, toUser);
        //还需要增加一条待催促的信息
    }
}
