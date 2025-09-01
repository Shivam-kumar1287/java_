package twodarray;
import java.util.*;

public class SpiralMatrix {

    public static void spiral(int arr[][]) {
        int sr = 0, sc = 0;
        int er = arr.length - 1;
        int ec = arr[0].length - 1;

        while (sr <= er && sc <= ec) {
            // Print top row (left to right)
            for (int j = sc; j <= ec; j++) {
                System.out.print(arr[sr][j] + " ");
            }
            sr++;  // Move down the start row after it's printed

            // Print right column (top to bottom)
            for (int i = sr; i <= er; i++) {
                System.out.print(arr[i][ec] + " ");
            }
            ec--;  // Move left the end column after it's printed

            if (sr <= er) {
                // Print bottom row (right to left)
                for (int j = ec; j >= sc; j--) {
                    System.out.print(arr[er][j] + " ");
                }
                er--;  // Move up the end row after it's printed
            }

            if (sc <= ec) {
                // Print left column (bottom to top)
                for (int i = er; i >= sr; i--) {
                    System.out.print(arr[i][sc] + " ");
                }
                sc++;  // Move right the start column after it's printed
            }
        }
        System.out.println("");  // New line after printing the spiral
    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter size of rows and columns: ");
        int m = Input.nextInt();
        int n = Input.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Input.nextInt();
            }
        }

        spiral(arr);  // Call the spiral function
    }
}
