package c;
import java.util.Scanner;
public class classs {
    public static void main(String[]  args){
        Scanner I=new Scanner(System.in);

        int a,b;
        a=I.nextInt();
        b=I.nextInt();
        calculator clac =new calculator();
        int result= clac.add(a,b);
        System.out.println("result "+result);

    }
    
}
class calculator{
public int add(int n1,int n2){
    int r=n1+n2;
    return r;


}
}
