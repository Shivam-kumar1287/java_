import java.util.*;

/* */
public class q2 {
    public static void main(String[] args) {
        Scanner Input =new Scanner(System.in);
        System.out.println("Enter charchter :) ");
        String s=Input.nextLine();
        int v=0,c=0;
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='a' || s.charAt(i)=='e' ||  s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || 
          s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'  )
          v++;
          else{
            c++;
          }
        }
        System.out.println(c+" "+ v);
    }
}
