package com.codewithharry.shape;

/*
📌 Circle Class
- Inherits Shape
*/
public class Circle extends Shape {

    protected double radius;

    public void setRadius(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
