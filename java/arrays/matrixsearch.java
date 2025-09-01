
import java.util.Scanner;

public class matrixsearch {

    public static  boolean   bin( int[][] arr,int target){
             int n=arr[0].length;
             int m=arr.length;
             int row=0; 
             int col=n-1;
             while (row<m  && col>=0) { 
                if(arr[row][col]==target){
                    return true; 
                }
                else if(arr[row][col]>target){
                    col--;
                }
                else{
                    row++;
                }
                 }
                 return  false;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;

       int r=sc.nextInt();
       int c=sc.nextInt();
       int[][] arr=new int[r][c];
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            arr[i][j]=sc.nextInt();
        }
       }

       System.out.println("Original Arrays :>)");

       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
           System.out.print(arr[i][j]+" ");
        }
        System.out.println("");
       }

       System.out.println("Enter your target");
       int k=sc.nextInt();
        if(bin(arr, k)){
            System.out.println("fond");

        }
        else{
            System.out.println("false");
        }

    }
}
