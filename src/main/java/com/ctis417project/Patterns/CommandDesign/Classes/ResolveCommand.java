package com.ctis417project.Patterns.CommandDesign.Classes;

import com.ctis417project.Patterns.CommandDesign.Interfaces.Command;

public class ResolveCommand implements Command {
    private TicketManager manager;
    private int ticketId;

    public ResolveCommand(TicketManager manager, int ticketId) {
        this.manager = manager;
        this.ticketId = ticketId;
    }

    public void execute() {
        manager.resolveTicket(ticketId);
    }

    public void undo() {
        manager.reopenTicket(ticketId);
    }
}
