package string;

import java.util.*;

public class point {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string like ewsn");
        String d = input.nextLine();
        
        // Starting coordinates (x, y) at (0, 0)
        int x = 0, y = 0;

        for (int i = 0; i < d.length(); i++) {
            char direction = d.charAt(i);  // Get the character at position i

            if (direction == 's') {
                y--;  // Move south (decrease y)
            } else if (direction == 'n') {
                y++;  // Move north (increase y)
            } else if (direction == 'w') {
                x--;  // Move west (decrease x)
            } else if (direction == 'e') {
                x++;  // Move east (increase x)
            }

            // Print the updated coordinates
            System.out.println("y: " + y + ", x: " + x);
        }

        input.close();  // Close the scanner
    }
}
