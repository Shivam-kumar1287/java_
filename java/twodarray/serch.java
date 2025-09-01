package twodarray;
import java.util.*;
public class serch {


    public static void main(String[] args){ 
        Scanner Input=new Scanner(System.in);
        int m,n;
        System.out.println("Enter row and col size ");
        m=Input.nextInt();
        n=Input.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=Input.nextInt();
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

       System.out.println("Enter serch Key");
        int key=Input.nextInt();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(key==arr[i][j]){
                    System.out.print(i+ " " + j);
                }
            }
        }
    }
}
