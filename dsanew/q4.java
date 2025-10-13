import java.util.*;
public  class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int chocolate=sc.nextInt();
        int students=sc.nextInt();
        int postion=sc.nextInt();
         int current=postion;

        // distribute chocolates
        //formula int lastStudent=(postion+chocolate-1)%students;
        // if(lastStudent==0) lastStudent=students;
        
        // System.out.println(lastStudent);

        while(chocolate>0){
           chocolate--;   // give one chocolate
            current++;      // move to next student

            if (current > students) {
                current = 1;
            }
        }
        System.out.println(current-1);

    }
}