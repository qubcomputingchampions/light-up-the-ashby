package models;

public class Display {
    private int[][] pixels;
    private double refreshRate;

    private final double pixelAspect = 0.8;
    private final double displayAspect = 1.0;

    public Display(int[][] pixels, double refreshRate) {
        this.pixels = pixels;
        this.refreshRate = refreshRate;
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
