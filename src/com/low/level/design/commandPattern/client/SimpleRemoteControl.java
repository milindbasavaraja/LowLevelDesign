package com.low.level.design.commandPattern.client;

import com.low.level.design.commandPattern.interfaces.Command;

public class SimpleRemoteControl {
    /**
     * One slot to hold the command, which will control one device
     */
    Command slot;

    public SimpleRemoteControl() {
    }

    /**
     * We have a method for setting the command the slot is going to control.
     * This could be called multiple times if the client of this code wanted to change the behavior of the remote button.
     * @param command
     */
    public void setCommand(Command command) {
        this.slot = command;
    }

    /**
     * This method is called when the button is pressed.
     * All we do is take current command bound to the slot and calls its execute() method
     */
    public void buttonWasPressed(){
        slot.execute();
    }
}
