import java.util.*; 
public class Anagram {  
    public static void main (String [] args) { 
         Scanner Input =new Scanner(System.in);
        String str1=Input.nextLine();  
        String str2=Input.nextLine();  

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length() != str2.length()){
            System.out.println("not a anagram");
        }
        else{
            char[] s1=str1.toCharArray();
            char[] s2=str2.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);
            if(Arrays.equals(s1, s2) == true) {  
                System.out.println("Both the strings are anagram");  
            }  
            else{
                System.out.println("not a Anangram");
            }
                
            }
        }
  
        
    }  
  