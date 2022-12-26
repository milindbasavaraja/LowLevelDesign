package com.low.level.design.commandPattern;

import com.low.level.design.commandPattern.client.SimpleRemoteControl;
import com.low.level.design.commandPattern.commands.garageDoorCommand.GarageDoorOpenCommand;
import com.low.level.design.commandPattern.commands.lightCommand.LightOnCommand;
import com.low.level.design.commandPattern.vendors.Garage;
import com.low.level.design.commandPattern.vendors.Light;

public class RemoteControlDemo {

    /**
     * Client in Command Design Pattern
     * @param args
     */
    public static void main(String[] args) {
        //The simpleRemoterControl is Invoker, it will be passed a command object that can be used to make requests.
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        //Create a Light object. This will be the Receiver of the request.
        Light light = new Light();
        Garage garage = new Garage();

        //Create a command and pass the Receiver to it
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garage);



        //Pass the command to invoker
        simpleRemoteControl.setCommand(lightOn);

        //Simulate button being pressed.
        simpleRemoteControl.buttonWasPressed();

        simpleRemoteControl.setCommand(garageDoorOpen);
        simpleRemoteControl.buttonWasPressed();
    }
}
