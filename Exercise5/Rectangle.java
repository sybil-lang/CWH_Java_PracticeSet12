package com.codewithharry.shape;

/*
📌 Rectangle Class
- Inherits Shape
*/
public class Rectangle extends Shape {

    protected double length;
    protected double breadth;

    // Getters & Setters
    public void setDimensions(double l, double b) {
        length = l;
        breadth = b;
    }

    public double area() {
        return length * breadth;
    }
}
