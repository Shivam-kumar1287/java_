package twodarray.matrix;
import java.util.*;
/*6) Java Program to display the lower triangular matrix
7) Java Program to display the upper triangular matrix 
 Java Program to Transpose matrix*/
public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter row and col");
        int r = input.nextInt();
        int c = input.nextInt();
        int a[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=input.nextInt();
            }
        }
    
        System.out.println("Upper Tranguler :)");

        for(int i = 0; i < r; i++){    
            for(int j = 0; j < c; j++){    
              if(j > i)    
                System.out.print("0 ");    
              else    
                System.out.print(a[i][j] + " ");    
          }    
          System.out.println();    
      }    
    
      System.out.println("Lower Tranguler :)");

      for(int i = 0; i < r; i++){    
        for(int j = 0; j < c; j++){    
          if(j < i)    
            System.out.print("0 ");    
          else    
            System.out.print(a[i][j] + " ");    
      }    
      System.out.println();    
  }    
  
  System.out.println("Original Matrix");
  for(int i = 0; i < r; i++){    
    for(int j = 0; j < c; j++){    
     System.out.print(a[i][j] + " ");
  }    
  System.out.println();    
}    


  System.out.println("Transpose of matrix");
  for(int i = 0; i < r; i++){    
    for(int j = 0; j < c; j++){    
     System.out.print(a[j][i] + " ");
  }    
  System.out.println();    
}    


    }
}
