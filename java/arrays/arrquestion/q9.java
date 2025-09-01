package arrays.arrquestion;

import java.util.Scanner;

/*Java Program to determine whether a given matrix is an identity matrix
 */
public class q9 {
     public static void matrx(int arr,int r,int c){
            boolean flag=true;
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){

                    if((i==j && arr[i][j]!=1) ||(i!=j && arr[i][j!=0]))  
                    flag=false;
                    return;
                     }

            }
            if (flag) {
                System.out.println("The matrix is an Identity matrix.");
            } else {
                System.out.println("The matrix is NOT an Identity matrix.");
            }


     }

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
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }


        matrx(arr,r,c);
    }
}
