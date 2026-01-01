package calculators;

import java.util.Scanner;   // Import Scanner class from java.util package

/*
====================================================
📌 Question 2 – Using Built-in Package
====================================================

✔ java.util is a built-in Java package
✔ Scanner class is used to take input from the user
✔ System.out.println() is used to display output

====================================================
*/

public class UseBuiltInPackage {

    public static void main(String[] args) {

        // Create Scanner object to take input from keyboard
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Displaying output
        System.out.println("You entered: " + number);

        // Close the scanner (good practice)
        sc.close();
    }
}


/*
Way to Compile
javac -d . UseBuiltInPackage.java

Way to RUN
java calculators.UseBuiltInPackage

*/