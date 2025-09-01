package Question;
import java.util.Scanner;
public class vowel {
  public static void main(String[] args)  {
   Scanner I=new Scanner(System.in);
   System.out.println("Enter a String");
   String s1=I.nextLine();
   int cout=0;
   s1=s1.toLowerCase();
   for(int i=0;i<s1.length();i++){
  
char s=s1.charAt(i);
   if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u'){
      cout++;
   }
}
   System.out.println(cout);
  }
}
