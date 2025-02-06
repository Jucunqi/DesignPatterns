package com.jcq.dp.command.v1;

/**
 * 定义命令抽象类
 * 
 * @author : jucunqi
 * @since : 2025/2/6
 */
public abstract class Command {

    public abstract void doit();
    public abstract void undo();
}
