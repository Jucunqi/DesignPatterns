package com.jcq.dp.command.v2;

public class DeleteCommand extends Command{

    Content c;
    String delete;
    public DeleteCommand(Content c) {
        this.c = c;
    }

    @Override
    public void doit() {
        String c1 = c.getC();
        String substring = c1.substring(0, 4);
        c.setC(substring);
        delete = c1.substring(4, c1.length() - 1);
        System.out.println("do delete result -> " + substring);
    }

    @Override
    public void undo() {

        c.setC(c.getC() + delete);
        System.out.println("undo delete result -> " + c.getC());
    }
}
