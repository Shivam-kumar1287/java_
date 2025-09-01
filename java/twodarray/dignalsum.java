package twodarray;
import java.util.*;

public class dignalsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n;
      
        // Get matrix size from user input
        System.out.print("Enter size of row and col: ");
        m = input.nextInt();
        n = input.nextInt();
        
        // Declare matrix of size m x n
        int arr[][] = new int[m][n];
        if(m==n){
            System.out.println("Enter elements of the matrix: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = input.nextInt();
                }
            }
            
            // Print the matrix
            System.out.println("The matrix is: ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            
            // Variables to store the sum of diagonals
            int rs = 0, ls = 0;
            
            // Loop to calculate the sum of diagonals
            for (int i = 0; i < m; i++) {
                // Right diagonal sum (i == j)
                if (i < n) {
                    rs += arr[i][i];
                }
                // Left diagonal sum (i + j == n - 1)
                if (i < n) {
                    ls += arr[i][n - 1 - i];
                }
            }
            
            // Print the diagonal sums
            System.out.println("Right Diagonal Sum: " + rs);
            System.out.println("Left Diagonal Sum: " + ls);
        } 
        
        else{
            System.out.println("Invliad row and column ");
        }
        }
        // Input matrix elements
       
}
