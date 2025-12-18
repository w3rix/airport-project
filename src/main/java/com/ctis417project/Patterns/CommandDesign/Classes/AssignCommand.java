package com.ctis417project.Patterns.CommandDesign.Classes;

import com.ctis417project.Patterns.CommandDesign.Interfaces.Command;

class AssignCommand implements Command {
    private TicketManager manager;
    private int ticketId;
    private String agent;

    public AssignCommand(TicketManager manager, int ticketId, String agent) {
        this.manager = manager;
        this.ticketId = ticketId;
        this.agent = agent;
    }

    public void execute() {
        manager.assignTicket(ticketId, agent);
        //System.out.println("Ticket With ID#" + ticketId + "Assigned to " + agent);
    }

    public void undo() {
        manager.unassignTicket(ticketId);
    }
}
