package com.jcq.dp.command.v2;

/**
 * 命令模式 结合 责任链模式
 *
 * @author : jucunqi
 * @since : 2025/2/6
 */
public class Main {

    public static void main(String[] args) {

        Content content = new Content("name is: ");
        InsertCommand insertCommand = new InsertCommand(content);
        // insertCommand.doit();
        // insertCommand.undo();
        //
        DeleteCommand deleteCommand = new DeleteCommand(content);
        // deleteCommand.doit();
        // deleteCommand.undo();

        CommandChain chain = new CommandChain();
        chain.add(insertCommand)
                .add(deleteCommand);
        chain.doit();

        chain.undo();
    }
}
