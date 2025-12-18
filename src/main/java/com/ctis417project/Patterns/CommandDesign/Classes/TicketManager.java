package com.ctis417project.Patterns.CommandDesign.Classes;

public class TicketManager {
    private java.util.Map<Integer, String> tickets = new java.util.HashMap<>();
    private java.util.Map<Integer, String> assignments = new java.util.HashMap<>();

    public void assignTicket(int id, String agent) {
        assignments.put(id, agent);
        System.out.println("  Ticket #" + id + " assigned to " + agent);
    }

    public void unassignTicket(int id) {
        String agent = assignments.remove(id);
        if (agent != null) {
            System.out.println("  Ticket #" + id + " unassigned from " + agent);
        }
    }

    public void resolveTicket(int id) {
        tickets.put(id, "RESOLVED");
        System.out.println("  Ticket #" + id + " marked as RESOLVED");
    }

    public void reopenTicket(int id) {
        tickets.put(id, "OPEN");
        System.out.println("  Ticket #" + id + " reopened");
    }

    public void createTicket(int id, String description) {
        tickets.put(id, "OPEN");
        System.out.println("  Ticket #" + id + " created: " + description);
    }
}
