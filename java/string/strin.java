package string;

import java.util.Scanner;

public class Strin {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Read a line of input from the user and store it in the string variable
        String a = input.nextLine();
        
        // Print the string
        System.out.println(a);

        // Flag to track if the string is a palindrome
        boolean isPalindrome = true;
        
        // Compare characters from both ends
        for (int i = 0; i < a.length() / 2; i++) {
            int n = a.length();
            if (a.charAt(i) != a.charAt(n - i - 1)) {
                // If a mismatch is found, set the flag to false and break
                isPalindrome = false;
                break;
            }
        }

        // Output the result based on the flag
        if (isPalindrome) {
            System.out.println("yes");
        } else {
            System.out.println("False");
        }

        // Close the scanner
        input.close();
    }
}
