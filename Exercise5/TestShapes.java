package com.codewithharry.shape;

public class TestShapes {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setDimensions(5, 4);
        System.out.println("Rectangle Area: " + r.area());

        Circle c = new Circle();
        c.setRadius(7);
        System.out.println("Circle Area: " + c.area());

        Cylinder cy = new Cylinder();
        cy.setRadius(3);
        cy.setHeight(5);
        System.out.println("Cylinder Volume: " + cy.volume());
    }
}

/*
====================================================
📌 How to Compile & Run a Packaged Java Program
   (Revision Notes – VS Code / Command Line)
====================================================

🔹 Step 1: Go to the correct directory
----------------------------------
Make sure you are inside the project folder
where all .java files are present.

Example:
PS C:\Users\charu\OneDrive\Desktop\package\Exercise5>

----------------------------------------------------

🔹 Step 2: Compile ALL Java files
----------------------------------
Command:
javac -d . *.java

What this does:
✔ Reads the package statement:
   package com.codewithharry.shape;

✔ Automatically creates folder structure:
   com/codewithharry/shape/

✔ Places all generated .class files
   inside the correct package folders

----------------------------------------------------

🔹 Step 3: Run the program
----------------------------------
Run the class that contains main() method
using its FULLY QUALIFIED NAME:

Command:
java com.codewithharry.shape.TestShapes

⚠️ Important:
- Do NOT use .class while running
- Always include the package name

----------------------------------------------------

🔹 Key Rules to Remember (EXAM GOLD)
----------------------------------
✔ Use `javac -d .` when packages are used
✔ Package name = folder structure
✔ Run using: java packageName.ClassName
✔ Compilation is done from project root

====================================================
*/
