package main.java.com.quantumdeity.javagameengine.Renderers;

import main.java.com.quantumdeity.javagameengine.Renderer;
import main.java.com.quantumdeity.javagameengine.WindowSettings;
import processing.core.PApplet;

public class ProcessingRenderer extends Renderer {
    private ProcessingHandle handle;

    @Override
    public void create(WindowSettings settings) {
        handle = new ProcessingHandle(settings);
        PApplet.runSketch(new String[]{ProcessingHandle.class.getName()}, handle);
    }

    @Override
    public void destroy() {

    }
}
