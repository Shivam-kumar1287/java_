package numberques;
import java.util.*;
public class palindromenumber {
    public static void main(String[] args){
        Scanner input=new  Scanner(System.in);

        System.out.println("Enter a number ");
        int num=input.nextInt();
        int sum=0,temp,r;
        temp=num;
        while (num>0) {
            r=num%10;
            sum=(sum*10)+r;
            num/=10;
        }
        if(sum==temp){
            System.out.println("Palindrom Number");
        }
        else{
            System.out.println("Not a palindrome number");
        }

    }
}
