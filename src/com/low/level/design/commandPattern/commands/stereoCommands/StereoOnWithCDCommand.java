package com.low.level.design.commandPattern.commands.stereoCommands;

import com.low.level.design.commandPattern.interfaces.Command;
import com.low.level.design.commandPattern.vendors.Stereo;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.stereoOn();
        stereo.stereoSetCD();
        stereo.stereoSetVolume(11);
    }
}
