package com.ctis417project.Patterns.BridgeDesign.Classes;

import com.ctis417project.Patterns.BridgeDesign.Interfaces.MessageSender;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("  [EMAIL] " + message);
    }
}
