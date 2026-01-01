/*
====================================================
📌 Exercise 5 – Shapes using Inheritance
====================================================

✔ Create a package named:
   com.codewithharry.shape

✔ The package should contain individual classes for:
   - Rectangle
   - Circle
   - Square
   - Cylinder
   - Sphere

✔ Use inheritance properly to manage the code

✔ Each class should include:
   - Getter and Setter methods for dimensions
   - Methods to calculate:
       → Area
       → Surface Area
       → Volume (where applicable)

====================================================


📦 Package Structure (VERY IMPORTANT)
src/
 └── com/
      └── codewithharry/
           └── shape/
                ├── Shape.java
                ├── Rectangle.java
                ├── Square.java
                ├── Circle.java
                ├── Cylinder.java
                └── Sphere.java


*/



package com.codewithharry.shape;

/*
📌 Base Class: Shape
- Parent class for all shapes
- Demonstrates inheritance
*/
public class Shape {

    public double area() {
        return 0;
    }

    public double surfaceArea() {
        return 0;
    }

    public double volume() {
        return 0;
    }
}
