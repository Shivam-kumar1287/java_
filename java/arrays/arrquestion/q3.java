import java.util.*;
/*Program to Print the Duplicate Elements of an Array | Find Duplicate Elements in an Array in Java */
public class q3{
  public static void main(String[] args) {
    Scanner Input=new Scanner(System.in);
    System.out.println("Size of arrya");
    int s=Input.nextInt();
    int arr[]=new int[s];
    for(int i=0;i<s;i++){
        arr[i]=Input.nextInt();
    }
    for(int i=0;i<s;i++){
        for(int j=i+1;j<s;j++)
        if(arr[i]==arr[j]){
            System.out.println(arr[i]+" duplicate number");
          break;
        }
    }

  }
}