package twodarray.matrix;
import java.util.*;
/*Java Program to find the frequency of odd & even numbers in the given matrix */
public class q3 {
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

        int even=0,odd=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]%2==0) even++;
                else odd++;
            }
        }
        System.out.println("Eevn Number"+ even);
        System.out.println("Odd NUmber  :)"+ odd);
        
    }
}
