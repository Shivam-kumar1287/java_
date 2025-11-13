
import java.util.Scanner;

public class StreamMaxMIn {


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int maxval=Integer.MIN_VALUE;
    int minval=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        int num=sc.nextInt();
        maxval=Math.max(maxval,n);
        minval=Math.min(minval,n);
        System  .out.println("currect max"+maxval+"current min "+minval);
    }
    }
}
