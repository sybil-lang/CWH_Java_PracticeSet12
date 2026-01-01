package com.codewithharry.shape;

/*
📌 Sphere Class
- Inherits Circle
*/
public class Sphere extends Circle {

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
