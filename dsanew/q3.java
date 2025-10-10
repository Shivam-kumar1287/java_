
import java.util.Scanner;
public class q3 {
    static int getfib(int n){
        if(n<=1){
            return n;
        }
        return getfib(n-1)+getfib(n-2);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int result=getfib(n);
        System.out.println(result);
        scanner.close();
    }
    
}
