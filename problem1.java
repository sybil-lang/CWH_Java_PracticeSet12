
//https://drive.google.com/file/d/1AdTlyEMz8KDEd8g-Sq79IEcdokoRctkt/view?usp=sharing

/*
====================================================
📘 Chapter 12 – Practice Set (Packages & Access Modifiers)
====================================================

1️⃣ Create three classes and group them into a package
----------------------------------------------------
✔ Classes to create:
   - Calculator
   - ScCalculator
   - HybridCalculator

✔ All three classes should be placed inside ONE package
   Example:
   package com.mycompany.calculators;



----------------------------------------------------

2️⃣ Use a built-in Java package to take input and display output
----------------------------------------------------
✔ Use built-in package:
   java.util

✔ Use Scanner class to:
   - Take input from the user
   - Display a message using System.out.println()

✔ Purpose:
   - Practice importing built-in packages
   - Understand user input handling

----------------------------------------------------

3️⃣ Create a package with three-level folder structure
----------------------------------------------------
✔ Package structure to create:

   folder
     └── folder1
           └── folder2

✔ Package declaration example:
   package folder.folder1.folder2;

✔ Purpose:
   - Understand hierarchical (nested) packages
   - Learn how Java maps packages to directories

----------------------------------------------------

4️⃣ Prove access rules for default and protected members
----------------------------------------------------
✔ Default (no modifier):
   - Accessible only within the SAME package
   - NOT accessible in subclasses outside the package

✔ Protected:
   - Accessible within the SAME package
   - Accessible in subclasses even in DIFFERENT packages

✔ Task:
   - Show that default members cannot be accessed in subclass outside package
   - Show that protected members CAN be accessed in subclass

✔ Purpose:
   - Deep understanding of access modifiers
   - Very important for exams & interviews

====================================================
📌 Focus Areas for Revision:
✔ Packages
✔ Built-in vs user-defined packages
✔ Nested packages
✔ Default vs protected access
====================================================
*/


package calculators;

/*
📌 Calculator Class
- Performs basic arithmetic operations
*/
 class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

/*
📌 Scientific Calculator Class
- Performs scientific calculations
*/
 class ScCalculator {

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public double power(double a, double b) {
        return Math.pow(a, b);
    }
}

/*
📌 Hybrid Calculator Class
- Combines features of Calculator and ScCalculator
*/
 class HybridCalculator {

    Calculator basicCalc = new Calculator();
    ScCalculator scientificCalc = new ScCalculator();

    public void demo() {
        System.out.println("Addition: " + basicCalc.add(5, 3));
        System.out.println("Square Root: " + scientificCalc.squareRoot(16));
    }
}
public class problem1 {

    public static void main(String[] args) {
        // HybridCalculator hybridCalc = new HybridCalculator();
        // hybridCalc.demo();
        System.out.println("Hybrid Calculator Demo Completed.");
    }
}


/*
 javac -d . .\problem1.java


 PS C:\Users\charu\OneDrive\Desktop\package> java calculators/problem1  
Hybrid Calculator Demo Completed.



*/