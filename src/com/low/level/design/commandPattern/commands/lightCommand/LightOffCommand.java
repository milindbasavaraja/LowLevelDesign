package com.low.level.design.commandPattern.commands.lightCommand;

import com.low.level.design.commandPattern.interfaces.Command;
import com.low.level.design.commandPattern.vendors.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
