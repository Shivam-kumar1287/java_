package twodarray;
import java.util.*;

public class indexfind {
    
    // Method to find the index of the key in the 2D array
    public static int[] index(int ar[][], int key) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == key) {
                    return new int[]{i, j};  // Return the row and column indices
                }
            }
        }
        return new int[]{-1, -1};  // If the key is not found, return [-1, -1]
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the size of the 2D array
        System.out.println("Enter size of row and column of 2D array:");
        int n = input.nextInt();
        int m = input.nextInt();
        
        // Create the 2D array
        int arr[][] = new int[n][m];

        // Fill the 2D array with user input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        
        // Print the 2D array (Matrix)
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  // Newline after each row
        }

        // Ask the user for the key to search for
        System.out.println("Enter key to search for:");
        int k = input.nextInt();
        
        // Call the index method to find the key in the array
        int[] result = index(arr, k);

        // Print the result
        if (result[0] != -1) {
            System.out.println("Key found at Row: " + result[0] + ", Column: " + result[1]);
        } else {
            System.out.println("Key not found");
        }
    }
}
