package com.low.level.design.commandPattern.client;

import com.low.level.design.commandPattern.interfaces.Command;

import java.util.Arrays;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
         for(int i=0;i<7;i++){
             onCommands[i] = () ->{};
             offCommands[i] = () ->{};
         }
    }

    public void setCommand(int slot,Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonPressed(int slot){
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuilder stringBuff = new StringBuilder();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("    ").append(offCommands[i].getClass().getName()).append("\n");
        }
        return stringBuff.toString();
    }

}
