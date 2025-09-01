package recursive;
import java.util.Scanner;



public class recursive {
   public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter a nuber");
      int num=input.nextInt();
      System.out.println("Factorical");
      System.out.println(fact(num));
      System.out.println("Sum");
      System.out.println(sum(num));
      System.out.println("Fabinanocial");
      System.out.println(fab(num));
   }

   public static int fact(int num){
    if(num==0 || num==1){
        return 1;
    }
    else{
        return num*fact(num-1);
    }
    }
    public static int sum(int num){
        if(num==0 || num==1){
            return 1;
        } 
        return num+ sum(num-1);
    }
    public static int fab(int num){
       if(num==0 || num==1)  {
        return num;
       }
       else{
        return fab(num-1)+ fab(num-2);
       }
    }
}

