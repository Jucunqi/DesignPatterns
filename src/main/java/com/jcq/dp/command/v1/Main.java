package com.jcq.dp.command.v1;

/**
 * 命令模式 
 * 
 * @author : jucunqi
 * @since : 2025/2/6
 */
public class Main {

    public static void main(String[] args) {

        Content content = new Content("name: ");
        InsertCommand insertConnand = new InsertCommand(content);
        insertConnand.doit();
        insertConnand.undo();
        System.out.println(content.getC());
    }
}
