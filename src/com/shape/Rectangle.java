package com.shape;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle() {
        this(1,2);
    }

    public Rectangle(int x, int y) {
        this(x,y,0,0);
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
/*
    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }*/
}
