package com.ctis417project.Patterns.CommandDesign.Invoker;

import com.ctis417project.Patterns.CommandDesign.Interfaces.Command;

public class TerminalInvoker {
    private java.util.Stack<Command> history = new java.util.Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
            System.out.println("  [UNDO] Last action reversed");
        } else {
            System.out.println("  [UNDO] No commands to undo");
        }
    }
}
