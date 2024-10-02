package main.java.com.quantumdeity.javagameengine;

public class WindowSettings {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static class Builder{
        WindowSettings windowSettings = new WindowSettings();

        public WindowSettings build(){
            return windowSettings;
        }

        public Builder setWidth(int width){
            windowSettings.width = width;
            return this;
        }

        public Builder setHeight(int height){
            windowSettings.height = height;
            return this;
        }
    }
}
