import java.util.Scanner;

public class q5 {
    /* Java Program to remove duplicate elements in an Array */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Size of array:");
        int s = Input.nextInt();
        int arr[] = new int[s];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < s; i++) {
            arr[i] = Input.nextInt();
        }
        
        
    
int j=0;
int temp[]=new int [s];
for(int i=0;i<s;i++)
{
    if(arr[i]!= arr[i+1]){
        temp[j++]=arr[i];
    }
}
for(int i=0;i<s;i++){
    System.out.print(arr[i]);
}

    }
}
