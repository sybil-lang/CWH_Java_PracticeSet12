package folder.folder1.folder2;

/*
====================================================
📌 Question 3 – Three-Level Package Structure
====================================================

✔ Demonstrates hierarchical (nested) packages
✔ Package name maps directly to folder structure
✔ Each dot (.) represents a directory level

====================================================
*/

public class NestedPackageDemo {

    public static void main(String[] args) {

        System.out.println("This class is inside a 3-level package!");
    }
}


/*
🛠️ How to Compile (VERY IMPORTANT)

From the project root directory:

javac -d . NestedPackageDemo.java


✔ -d . tells Java to create directories automatically

▶️ How to Run
java folder.folder1.folder2.NestedPackageDemo
*/