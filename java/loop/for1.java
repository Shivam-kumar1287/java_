package loop;
import java.util.Scanner;
public class for1 {
    public static void main(String [] args){
        Scanner I=new Scanner(System.in);
         int sum=0;
  System.out.println("Enter a numter for sum os sum a natural ");
  int n=I.nextInt();
  for(int i=0;i<=n;i++){
    System.out.println(i+"\t");
    sum +=i;
  }
  System.out.println(sum);
  System.out.println("Average "+sum/n);
  for(int i=1;i<n;i++){
    System.out.println("number is "+i+"& square "+(i*i));
  }
}   
    


}
