package com.jcq.dp.command.v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandChain extends Command{

    List<Command> commandList = new ArrayList<>();
    List<Command> doList = new ArrayList<>();
    public CommandChain add(Command command) {

        commandList.add(command);
        return this;
    }

    @Override
    public void doit() {

        for (Command command : commandList) {
            command.doit();
            doList.add(command);
        }
    }

    @Override
    public void undo() {

        Collections.reverse(doList);
        for (Command command : doList) {
            command.undo();
        }
    }
}
