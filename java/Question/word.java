package Question;
import java.util.Scanner;
public class word {
    public static void main(String[] args){
        Scanner I=new Scanner(System.in);
        System.out.println("Enter a word line for cout word ");
        String s1=I.nextLine();
        int cout=0;
        if (!(" ".equals(s1.substring(0, 1))) || !(" ".equals(s1.substring(s1.length() - 1))))
{
        for(int i=0;i<s1.length();i++){
         if(s1.charAt(i)== ' '){
           cout++;
         }
        }}
        System.out.println("cout "+cout);
    }
}
