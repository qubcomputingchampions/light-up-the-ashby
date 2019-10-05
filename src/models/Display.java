package models;

public class Display {
    private int[][] pixels;
    private double refreshRate;

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
}
