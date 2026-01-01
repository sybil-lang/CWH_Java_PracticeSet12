package com.codewithharry.shape;

/*
📌 Cylinder Class
- Inherits Circle
*/
public class Cylinder extends Circle {

    private double height;

    public void setHeight(double h) {
        height = h;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
