import java.util.*;

public class q4 {
    
   public static void main(String[] args) {
     Scanner Input = new Scanner(System.in);

     // Get the size of the array
     System.out.println("Size of array:");
     int s = Input.nextInt();
     int arr[] = new int[s];
     
     // Input the array elements
     System.out.println("Enter the elements of the array:");
     for (int i = 0; i < s; i++) {
        arr[i] = Input.nextInt();
     }

     // Print the array in reverse order
     System.out.println("Array in reverse order:");
     for (int i = s - 1; i >= 0; i--) {
        System.out.print(arr[i] + " ");
     }
     System.out.println();

     // Print elements at even positions (index 0, 2, 4, ...)
     System.out.println("Elements at even positions (0-based):");
     for (int i = 0; i < s; i += 2) {
        System.out.print(arr[i] + " ");
     }
     System.out.println();

     // Print elements at odd positions (index 1, 3, 5, ...)
     System.out.println("Elements at odd positions (0-based):");
     for (int i = 1; i < s; i += 2) {
        System.out.print(arr[i] + " ");
     }
     System.out.println();
   }   
}
