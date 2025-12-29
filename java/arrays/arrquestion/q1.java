/* 1. Program to find the frequency of each element in the array */

import java.util.*;
public class q1 {
    
    public static void main(String[] args) {
        Scanner Input =new Scanner(System.in);
        System.out.println("Enter A size of Arrays");;
        int s=Input.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=Input.nextInt();
        }

       for(int i=0;i<s;i++){
        int cout=1;
        if (arr[i] == -1) continue;
        for (int j = i + 1; j < s; j++){
           if(arr[i]==arr[j]){
              cout++;
              arr[j] = -1; 
           }
        }
        System.out.println(arr[i]+"| "+cout);
       }
    }
}
