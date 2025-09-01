package numberques;
import java.util.*;
public class ArmstrongNum {
    public static void main(String[] args){
         Scanner input=new Scanner(System.in);
         System.out.println("Emate a number");
         int num=input.nextInt();
         int temp=num;
         int sum=0;
            int digit=0;
         while (temp !=0) {
            temp/=10;
            digit++;
         }
         temp=num;
        while (temp !=0) {
         int r=temp%10;
            sum+=Math.pow(r, digit);
            temp/=10;
            

        }
        if(num==sum  ){
            System.out.println(num+" Palindrome Number");
        }
        else{
            System.out.println(num+" Not a Palindrome Number");
        }
        input.close();
    }
}
