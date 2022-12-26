package com.low.level.design.commandPattern.vendors;

public class Stereo {
    public void stereoOn() {
        System.out.println("Stereo is switched On");
    }

    public void stereoff() {
        System.out.println("Stereo is switched Off");
    }

    public void stereoSetCD() {
        System.out.println("Stereo is set with CD");
    }

    public void stereoSetDvd() {
        System.out.println("Stereo is set with DVD");
    }

    public void stereoSetRadio() {
        System.out.println("Stereo is set with Radio");
    }

    public void stereoSetVolume(int volume) {
        System.out.println("Stereo is set Volume " + volume);
    }
}
