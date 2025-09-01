package loop;
import java.util.Scanner;
public class table {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter A num for write Tables");
        int t=a.nextInt();
        for(int i=1; i<=10;i++)
        {
         System.out.println(t+" X " +i+ "="+ i*t);    
        }
    }
}
