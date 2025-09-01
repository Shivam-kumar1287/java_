import java.util.*;

public class q2 {
    // Method to perform right rotation on the array
    public static void rightRotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;  // Handle case where k is larger than array size
        int[] temp = new int[k];  // Temporary array to store the last k elements
        
        // Store the last k elements in the temp array
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }
        
        // Shift the remaining elements to the right
        for (int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }
        
        // Copy the elements from temp array to the start of arr
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking array input
        System.out.println("Size of array:");
        int l = input.nextInt();
        int[] arr = new int[l];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < l; i++) {
            arr[i] = input.nextInt();
        }
        
        // Taking rotation index input
        System.out.println("Enter the number of positions to rotate:");
        int k = input.nextInt();
        
        // Perform the right rotation
        rightRotate(arr, k);

        // Print the rotated array
        System.out.println("Array after right rotation:");
        System.out.println(Arrays.toString(arr));
    }
}
