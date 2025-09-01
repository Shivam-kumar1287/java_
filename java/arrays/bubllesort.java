package arrays;

import java.util.Scanner;
public class bubllesort{
   public static void bublleso(int aar[]){
    int n=aar.length;
    for(int i=0;i<n-1;i++){
         for(int j=0;j<n-i-1;j++){
            if(aar[j]>aar[j+1]){
                int temp=aar[j];
                aar[j]=aar[j+1];
                aar[j+1]=temp;
            }
         }
    }

}

public static void selectionsort(int arr[]){
    for(int i=0;i<arr.length-1;i++){
        int minpos=i;
        int j=0;
        for(j=j+1;j<arr.length-1;j++){
            if(arr[minpos]>arr[j]){
                minpos=j;
            }
        }
        int temp=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
    }
}

public static void insertionsort(int arr[]){
    for(int i=1;i<arr.length;i++){
        int c=arr[i],p=i-1;
        while (p>=0 && arr[p]>arr[c]) {
            arr[p+1]=arr[p];
            p--;
        }
        arr[p+1]=arr[c];
    }
}
public static void main(String[] args){
  Scanner  scanner=new Scanner(System.in);
  System.out.println("Enter size of array");
  int nu=scanner.nextInt();
  int[] ar= new int[nu];

for(int i=0;i<nu;i++){
    System.out.println("enter array "+(i+1));
    ar[i]=scanner.nextInt();
}

insertionsort(ar);
for(int i=0;i<nu;i++){
    System.out.print(" "+ar[i]);
}
scanner.close();
}
}