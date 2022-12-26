package com.low.level.design.commandPattern.commands.lightCommand;

import com.low.level.design.commandPattern.interfaces.Command;
import com.low.level.design.commandPattern.vendors.Light;

/**
 * This is a command, so we need to implement the Command Interface.
 */
public class LightOnCommand implements Command {

    Light light;

    /**
     * The constructor is passed the specific light that this command is going to control - say living room light.
     * When execute gets called,this is the light object that is going to be the receiver of the request.
     * @param light
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * The execute() calls the on() method on the receiving object,which is the light we are controlling.
     */
    @Override
    public void execute() {
        light.on();
    }
}
