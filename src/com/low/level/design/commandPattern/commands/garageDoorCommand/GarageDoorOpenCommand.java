package com.low.level.design.commandPattern.commands.garageDoorCommand;

import com.low.level.design.commandPattern.interfaces.Command;
import com.low.level.design.commandPattern.vendors.Garage;

public class GarageDoorOpenCommand implements Command {

    Garage garage;

    public GarageDoorOpenCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        garage.openGarageDoor();
    }
}
