package com.zhaofeng.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/10/26
 * Time: 15:05
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args) {

        //创建具体的实现对象
        MessageImplementor impl = new MessageSMS();

        //创建一个普通消息对象
        AbstractMessage m = new CommonMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");

        //创建一个紧急消息对象
        m = new UrgencyMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");

        //创建一个特急消息对象
        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");

        //把实现方式切换成手机短消息，然后再实现一遍
        impl = new MessageMobile();
        m = new CommonMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");
        m = new UrgencyMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");
        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");
    }
}
