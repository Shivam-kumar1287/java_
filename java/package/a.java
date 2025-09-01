// package package.mypack;  // Correct package declaration
// import java.util.*;  // Import necessary classes 
// import package.mypack.MyPackage; 
// // Correct import statement

public class a {
    public static void main(String[] args) {
        // Use the static method from MyPackage
        MyPackage.printMessage();

        // Create an instance and use non-static method
        MyPackage mp = new MyPackage();
        int result = mp.addNumbers(5, 3);
        System.out.println("5 + 3 = " + result);
    }
}
// Define MyPackage class in the same file for demonstration
// class MyPackage {
//     public static void printMessage() {
//         System.out.println("Hello from MyPackage!");
//     }

//     public int addNumbers(int a, int b) {
//         return a + b;
//     }
// }