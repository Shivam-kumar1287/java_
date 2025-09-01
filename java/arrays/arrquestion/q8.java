import java.util.*;

public class q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of rows and columns:");
        int r = input.nextInt();
        int c = input.nextInt();
        
        if (r != c) {
            System.out.println("For diagonal sums, the array must be square (rows = columns).");
            return; // Exiting if it's not a square matrix
        }

        int arr[][] = new int[r][c];
        
        // Reading the 2D array elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        // Initializing sum variables for diagonals
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        // Calculating sums for the left and right diagonals
        for (int i = 0; i < r; i++) {
            leftDiagonalSum += arr[i][i];  // Left diagonal (arr[i][i])
            rightDiagonalSum += arr[i][c - 1 - i]; // Right diagonal (arr[i][c-1-i])
        }

        // Printing the 2D array
        System.out.println("The entered matrix is:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Print new line after each row
        }

        // Printing the sum of both diagonals
        System.out.println("Sum of left diagonal: " + leftDiagonalSum);
        System.out.println("Sum of right diagonal: " + rightDiagonalSum);
    }
}
