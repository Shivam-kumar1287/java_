import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
    
        System.out.println("Size of array:");
        int s = Input.nextInt();
        int arr[] = new int[s];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < s; i++) {
            arr[i] = Input.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < s; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max value: " + max);

        for (int i = 1; i < s; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min value: " + min);
    }
}
