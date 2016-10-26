package com.zhaofeng.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/26
 * Time: 15:04
 * To change this template use File | Settings | File Templates.
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    public void sendMessage(String message, String toUser) {
        message = "加急：" + message;
        super.sendMessage(message, toUser);
    }

    public Object watch(String messageId) {
        //获取相应的数据，组织成监控的数据对象，然后返回
        return null;

    }
}
