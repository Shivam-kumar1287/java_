package twodarray.matrix;
import java.util.*;
/*Java Program to determine whether two matrices are equal */
public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter row and col");
        int r = input.nextInt();
        int c = input.nextInt();
        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        boolean flag = true; 
        System.out.println("Enter elements for matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter elements for matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] != b[i][j]) {
                    flag = false; 
                    break;
                }
            }
            if (!flag) break;  }

       
        if (flag) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
