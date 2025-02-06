package com.jcq.dp.command.v1;

/**
 * 新增命令
 *
 * @author : jucunqi
 * @since : 2025/2/6
 */
public class InsertCommand extends Command{

    Content c;
    String insertC = "luca jcq";
    public InsertCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {

        String c1 = c.getC();
        c.setC(c1 + insertC);
    }

    @Override
    public void undo() {
        String substring = c.getC().substring(0, c.getC().length() - 8);
        c.setC(substring);
    }
}
