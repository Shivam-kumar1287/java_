package Question;
import java.util.Scanner;
public class wordcount {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int cout=0;
        System.out.println("Enter a line of word");
        String s=input.nextLine();
        for(int i=0;i<s.length();i++){
            if(i == " "){
              cout++;
            }
        }
        System.out.println("cout"+cout;);
    }
}
