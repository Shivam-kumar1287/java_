package arrays;
import java.util.*;
public class liner {
    public static void main(String[] args) {
        Scanner inpuScanner=new Scanner(System.in);
        System.out.println("ldsj");
        int arr[]={2,3,5,6,7,8,9};
        System.out.println("Enta a number");
          int k=inpuScanner.nextInt();

          boolean f=false;

          for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println(k+" :) "+ i);
             f=true;
             break;
            }
        }
        if(!f){
            System.out.println("not found");
        }
        
    }
}
