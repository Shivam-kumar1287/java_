package string;
import java.util.*;
public class largest {
    public static void main(String[] args){
        String[] ch = {"jkdjfsk", "jskdjf", "msds"};
        
        // Initialize `lar` with the first element in the array
        String lar = ch[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < ch.length; i++) {
            // Compare strings based on length
            if (lar.length() < ch[i].length()) {
                lar = ch[i];  // Update `lar` if a longer string is found
            }
        }
        
        // Print the longest string
        System.out.println("The largest string is: " + lar);
 
    }
}
