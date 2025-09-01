package oprater;
import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
  Scanner I= new Scanner(System.in);

   System.out.println("Enter the years :)");
  int y=I.nextInt();
   System.out.println("Enter the month number :) ");
   int m=I.nextInt();
   int d;
   switch (m) {
    case 1:
         d=31;
    break;
    case 2:
       if(y%4==0 && (y%100 != 0) || y%400==0){
          d=29;
       }
       else{
         d=28;
       }
       break;
    case 3:
        d=32;
        break;
    case 4:
       d=30;
       break;
    case 5:
      d=31;
      break;
    case 6:
      d=30;
      break;
    case 7:
      d=31;
       break;
    case 8:
     d=30;
     break;
     case 9:
      d=31;
      break;
    case 10:
       d=30;
       break;
    case 11:
     d=31;
      break;
      case 12:
       d=31;
       break;
    default:
       System.out.println("Defalut value ");
    return ;
   }
   System.out.println("this is"+y+"& monthe days = :) "+ d);
    }


}
