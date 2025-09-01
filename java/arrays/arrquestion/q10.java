import java.util.*;

public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of rows and columns:");
        int r = input.nextInt();
        int c = input.nextInt();
        
        if (r != c) {
            System.out.println("For diagonal sums, the array must be square (rows = columns).");
            return; 
        }

        int arr[][] = new int[r][c];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


int co=0;
for (int i = 0; i < r; i++) {
    for (int j = 0; j < c; j++) {
        if(arr[i][j]==0){
            co++;
        }
    }
}
if(arr.length/2<c){
    System.out.println("yes matrix is sparse matrix");
}
else{
    System.out.println("not your matrix is not a sparse matrix");
}


    }
}
