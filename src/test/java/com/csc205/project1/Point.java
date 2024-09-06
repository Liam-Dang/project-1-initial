package com.csc205.project1;

public class Point {
    private double x;
    private double y;

    // Constructor that takes x and y coordinates as double arguments
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Setter for x coordinate
    public void setX(double x) {
        this.x = x;
    }

    // Setter for y coordinate
    public void setY(double y) {
        this.y = y;
    }

    // Getter for x coordinate
    public double getX() {
        return this.x;
    }

    // Getter for y coordinate
    public double getY() {
        return this.y;
    }

    // Set the coordinates of the point
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Shift the point by a given amount along the x-axis
    public void shiftX(double n) {
        this.x += n;
    }

    // Shift the point by a given amount along the y-axis
    public void shiftY(double n) {
        this.y += n;
    }

    // Find the distance to another point
    public double distance(Point p2) {
        double dx = this.x - p2.getX();
        double dy = this.y - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Rotate the point by a specified (radian) angle around the origin
    public void rotate(double angle) {
        double newX = this.x * Math.cos(angle) - this.y * Math.sin(angle);
        double newY = this.x * Math.sin(angle) + this.y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Point(" + "x=" + x + ", y=" + y + ')';
    }
}