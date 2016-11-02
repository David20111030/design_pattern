package com.zhaofeng.command;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/11/2
 * Time: 17:22
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        //客户端直接执行具体命令方式（此方式与类图相符）
        command.execute();

        //客户端通过调用者来执行命令
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
