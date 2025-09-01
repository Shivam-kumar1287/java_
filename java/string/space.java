package string;
import java.util.*;
public class space {

    public static String  toupper(String str){
        StringBuilder sb=new StringBuilder("");
        char ch =Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args ){
        System.out.println("Enter a word line: ");
        Scanner input = new Scanner(System.in);
        String ch = input.nextLine();
        
     System.out.println(      toupper(ch)
     );
    }
}
