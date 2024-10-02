package main.java.com.quantumdeity.javagameengine.Renderers;

import main.java.com.quantumdeity.javagameengine.Renderer;
import processing.core.PApplet;

public class ProcessingRenderer extends Renderer {
    private ProcessingHandle handle;

    @Override
    public void create() {
        handle = new ProcessingHandle();
        PApplet.runSketch(new String[]{ProcessingHandle.class.getName()}, handle);
    }

    @Override
    public void destroy() {

    }
}
