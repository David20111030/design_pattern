package com.zhaofeng.command;

/**
 * Created with IntelliJ IDEA.
 * User: 赵峰
 * Date: 2016/11/2
 * Time: 17:22
 * To change this template use File | Settings | File Templates.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
