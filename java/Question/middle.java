package Question;
import java.util.Scanner;




public class middle {
    public static void main(String[] args){
        Scanner I=new Scanner(System.in);
        System.out.println("enter A string");
        String str=I.nextLine();
        System.out.println("Middle character "+ getmiddle(str));
        
    }
    
    public static String getmiddle(String s1){
        int length=s1.length();
        
       if(length==0){return "";}
       //for even length;
       if(length%2==0){
        int m1=length/2-1;
        int m2=length/2;
        return  s1.substring(m1, m2+1);
    }
    //for odd
    else{
        int mid=length/2;
        return String.valueOf(s1.charAt(mid));
    }
    }
}
