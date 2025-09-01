package numberques;
import java.util.*;
public class fib {
    public static void main(String[] args){
      Scanner input=new Scanner(System.in);
      System.out.println("Enter a 1 to n number");;
      int num=input.nextInt();
      int n1=0,n2=1,n3;
      for(int i = 2;i<num;i++){
          n3=n1+n2;
          System.out.println(n3+"");
          n1=n2;
          n2=n3;
      }
    }
}
