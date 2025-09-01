package stringf;
import java.util.Scanner;
public class basic {
   public static void main (String[] args){
     Scanner I=new Scanner(System.in);
    String txt="Shivam Rajput " ;
    System.out.println("this a string text "+txt);
    System.out.println("method find for length "+txt.length());

    System.out.println(txt.toLowerCase());
    System.out.println(txt.toUpperCase());

    System.out.println(txt.indexOf("Rajput"));
   
    System.out.println("Concatenation");
    String  f1= "shiva", f2=" is god";
    System.out.println(f1.concat(f2));
    System.out.println(":) :) :) :) :) :):) :) :):) :) :):) :) :):) :) :):) :) :) ");
    System.out.println("Special Characters");

    System.out.println("the character \\ is called backlash ");
    System.out.println("It\'s think ok ");
    System.out.println("new line character");
    System.out.println("hello \n world");

    System.out.println("Carriage return ");
    System.out.println("hello \r world");
   
    System.out.println("tab");
    System.out.println("hello \t world");

    System.out.println("backspace");
    System.out.println("hello \b world");

    System.out.println("Form feed");
    System.out.println("dnfj \fsdkjs");


    
   }
}
