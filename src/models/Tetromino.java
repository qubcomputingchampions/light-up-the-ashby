package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tetromino {
    private Shape shape;
    private Orientation orientation;
    private String color;
    private double x, y;
    private double xAcceleration, yAcceleration;
    private final double gravity = 1.0;

    public Tetromino(Shape shape) {
        this.shape = shape;
        // Set default options
        this.orientation = Orientation.NORTH;
        this.color = originalColor();
        this.x = 0;
        this.y = 0;
        this.xAcceleration = 1;
        this.yAcceleration = 1;
    }

    private String originalColor() {
        var shapeDetails = this.shape.toString();
        var originalColor = shapeDetails.split("(?<=(Original Colour: ))\\w*");

        // TODO: verify correct result
        return originalColor[0];
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getxAcceleration() {
        return xAcceleration;
    }

    public void setxAcceleration(double xAcceleration) {
        this.xAcceleration = xAcceleration;
    }

    public double getyAcceleration() {
        return yAcceleration;
    }

    public void setyAcceleration(double yAcceleration) {
        this.yAcceleration = yAcceleration;
    }

    public double getGravity() {
        return gravity;
    }
}
