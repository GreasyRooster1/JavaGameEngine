package test.java.TestDemos.RenderDemo;

import main.java.com.quantumdeity.javagameengine.Renderer;
import main.java.com.quantumdeity.javagameengine.Renderers.ProcessingRenderer;

public class RenderDemo {
    static Renderer renderer = new ProcessingRenderer();

    public static void main(String[] args){
        renderer.create();
    }
}
