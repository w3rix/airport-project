package com.ctis417project.Patterns.BridgeDesign.Classes;

import com.ctis417project.Patterns.BridgeDesign.Interfaces.MessageSender;

class SMSSender implements MessageSender {
    public void sendMessage(String message) {
        System.out.println("  [SMS] " + message);
    }
}
