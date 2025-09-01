import java.util.*;

/*Java Program to Count the Total Number of Punctuation Characters Exists in a String.
 (!, . , ' , - , " , ? , ; ) 
*/
public class q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter characters:");
        String s = input.nextLine();
        
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '!' || ch == '.' || ch == ',' || ch == '\'' || ch == '-' || ch == '\"' || ch == '?' || ch == ';') {
                count++; 
            }
        }
        
        System.out.println("Total number of punctuation characters: " + count);
    }
}
