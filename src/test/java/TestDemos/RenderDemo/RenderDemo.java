package test.java.TestDemos.RenderDemo;

import main.java.com.quantumdeity.javagameengine.Renderer;
import main.java.com.quantumdeity.javagameengine.Renderers.ProcessingRenderer;
import main.java.com.quantumdeity.javagameengine.WindowSettings;

public class RenderDemo {
    static Renderer renderer = new ProcessingRenderer();

    public static void main(String[] args){
        WindowSettings settings = new WindowSettings.Builder().setHeight(500).setWidth(500).build();
        renderer.create(settings);
    }
}
