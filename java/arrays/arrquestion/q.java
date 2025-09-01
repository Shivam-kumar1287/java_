// import java.util.*;
// public class q5 {

//     public static void main(String[] args) {
//        Scanner Input=new Scanner(System.in);
//        System.out.println("Size of array:");
//        int s = Input.nextInt();
//        int arr[] = new int[s];
       
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < s; i++) {
//            arr[i] = Input.nextInt();
//        }
//        int temp=0;
//         for(int i=0;i<s;i++){
//             for(int j=i+1;i<s;j++){
//                 if(arr[i]>arr[j]){
//                     temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }
//         System.out.println("Ascending Order");
//        for(int i=0;i<s;i++)
//        {
//         System.out.print(arr[i]+" ");
//        }
//     }
// }


import java.util.*;

public class q {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Size of array:");
        int s = Input.nextInt();
        int arr[] = new int[s];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < s; i++) {
            arr[i] = Input.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < s; i++) {
            for (int j = i + 1; j < s; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Ascending Order");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}