package com.zhaofeng.command;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/11/2
 * Time: 17:21
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteCommand extends Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}