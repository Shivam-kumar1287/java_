import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        try {
            System.out.println("Enter a non-negative integer:");
            int f1 = sc1.nextInt();
            
            if (f1 < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                int fact = 1;
                for (int i = 1; i <= f1; i++) {
                    fact *= i;
                }
                System.out.println("Factorial of " + f1 + " is " + fact);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        } finally {
            sc1.close(); // Close the scanner
        }
    }
}
