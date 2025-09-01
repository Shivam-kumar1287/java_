package numberques;
import java.util.*;
public class genratepalindrome {
     public static boolean ispalinedrome(int num){
        int r,rev=0;
        int temp=num;;
        int digit;
        while (num!=0) {
            digit=num%10;
            rev=(rev*10)+digit;
            num/=10;
        }

        return temp==rev;
     }

    public static void genpalindrome(int limit){
        for(int i=1;i<limit;i++){
            if(ispalinedrome(i))
            System.out.println(i); 
        }
}
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number");;
    int limit=input.nextInt();
    System.out.println("your limit genrate for palindrome number"+limit+"");
    genpalindrome(limit);
   }
}
