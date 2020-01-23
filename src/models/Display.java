package models;

public class Display {
    private int width, height;
    private int[][] pixels;
    private double refreshRate;

    private final double pixelAspect = 0.8;
    private final double displayAspect = 1.0;

    public Display(int width, int height) {
        this.width = width;
        this.height = height;
        this.pixels = new int[width][height];
        // Default refresh rate for normal screens would be 30, 60 or 144 Hertz
        // A small value to start will slow things down to help with initial debugging
        this.refreshRate = 2;
    }

    public int[][] getPixels() {
        return pixels;
    }

    public void setPixels(int[][] pixels) {
        this.pixels = pixels;
    }

    public double getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(double refreshRate) {
        this.refreshRate = refreshRate;
    }

    public double getPixelAspect() {
        return pixelAspect;
    }

    public double getDisplayAspect() {
        return displayAspect;
    }
}
