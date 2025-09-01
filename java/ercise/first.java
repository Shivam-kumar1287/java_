import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        

        
        System.out.print("Enter the marks for Science: ");
        int a = sc1.nextInt();
        
        System.out.print("Enter the marks for mathe: ");
        int b = sc1.nextInt();
        

        System.out.println("Enter the marks for sst");
        int c=sc1.nextInt();
        System.out.println("Enter the marks for Hindi");
        int d=sc1.nextInt();
        System.out.println("Enter the marks for English");
        int e=sc1.nextInt();
        float ave=a+b+c+d+e/5;        
        System.out.println("Percatage "+ave);





        sc1.close();

    }
}
