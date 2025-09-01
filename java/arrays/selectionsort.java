
import java.util.Scanner;

public class selectionsort {

    // Insertion Sort method
    public static void insertionsort(int arr[] ,int pass) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Element to be inserted
            int j = i - 1;    // Compare with elements before

            // Shift elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1]=key;
            if(pass==i){
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            }
            // Insert the key at the correct position
            arr[j + 1] = key;
        }
    }

    public static void selesort(int arr[] ,int pass) {
        int n = arr.length;

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap only if min index changes
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            // Print array after each pass (for visualization)
            if(i==pass){
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {29, 10, 14, 37, 13, 88, 23, 9};
        
        int pass=sc.nextInt();
       selesort(arr,pass);
        // Final result after Selection Sort
        
        System.out.println("Array after Selection Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Now perform Insertion Sort and print the result
        System.out.println("\n\nINSERTION SORT");
        insertionsort(arr,pass);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
