package Question;
import java.util.Scanner;
public class digitcount {
    public static void main(String[] args){
     Scanner In=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=In.nextInt();
    if(n>0){
        int c=0;
        while (n!=0) {
           n/=10;
           c++;
            
        }
        System.out.println("the number of digits is "+c);

    }
    else{
        System.out.println("not count");
    }

    }
}
