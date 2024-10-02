package main.java.com.quantumdeity.javagameengine.Renderers;

import main.java.com.quantumdeity.javagameengine.WindowSettings;
import processing.core.PApplet;

public class ProcessingHandle extends PApplet {
    private final WindowSettings windowSettings;

    public ProcessingHandle(WindowSettings windowSettings) {
        this.windowSettings = windowSettings;
    }

    public void settings(){
        size(windowSettings.getWidth(), windowSettings.getHeight());
    }
}
