package model.phone;

import model.phone.applications.InternetBrowser;
import model.phone.applications.MusicPlayer;
import model.phone.applications.TelephoneDevice;

public class Iphone implements TelephoneDevice, InternetBrowser, MusicPlayer {
    @Override
    public void browse() {
        System.out.println("Browse phone...");
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void call() {
        System.out.println("Calling Internet Browser");
    }
}
