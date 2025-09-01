package Question;
import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int n = Input.nextInt();
        System.out.println("Enter number of columns:");
        int n1 = Input.nextInt();

        // Initialize the first matrix
        int[][] arr = new int[n][n1];
        System.out.println("Enter values for the first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n1; j++) {
                arr[i][j] = Input.nextInt();
            }
        }

        // Initialize the second matrix
        int[][] arr1 = new int[n][n1];
        System.out.println("Enter values for the second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n1; j++) {
                arr1[i][j] = Input.nextInt();
            }
        }

        // Print the first matrix
        System.out.println("First matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Print the second matrix
        System.out.println("Second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        // Add the two matrices
        int[][] sumMatrix = new int[n][n1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n1; j++) {
                sumMatrix[i][j] = arr[i][j] + arr1[i][j];
            }
        }

        // Print the sum of the two matrices
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Multiply the two matrices
        // For multiplication, ensure the second matrix dimensions match for multiplication
        System.out.println("Enter number of columns for the second matrix (for multiplication):");
        int m = Input.nextInt(); // New input for matrix multiplication

        // Initialize the second matrix for multiplication
        int[][] arr1ForMultiplication = new int[n1][m];
        System.out.println("Enter values for the second matrix for multiplication:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m; j++) {
                arr1ForMultiplication[i][j] = Input.nextInt();
            }
        }

        // Result matrix for multiplication
        int[][] productMatrix = new int[n][m];

        // Perform matrix multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n1; k++) {
                    productMatrix[i][j] += arr[i][k] * arr1ForMultiplication[k][j];
                }
            }
        }

        // Print the product of the two matrices
        System.out.println("Product of the two matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }

        Input.close(); // Close the scanner
    }
}
