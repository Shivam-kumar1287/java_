package maths;
import java.util.Scanner;
public class basic1 {
    public static void main(String[] args){

        Scanner I=new Scanner(System.in);
        System.out.println("max "+Math.max(4,5));
        System.out.println("min "+Math.min(4,5));
        System.out.println("squrt "+ Math.sqrt(5));
        /*Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0 */
        System.out.println("Enter three number");
        int n1=I.nextInt();
        int n2=I.nextInt();
         int n3=I.nextInt();
         System.out.println("the is samllest number in "+n1+" "+" "+n2+" "+" "+n3 +" smallest number :) " + smller(n1,n2,n3));
         System.out.println("the is samllest number in "+n1+" "+" "+n2+" "+" "+n3 +" smallest number :) " + largest(n1,n2,n3));



         /*2. Write a Java method to compute the average of three numbers.
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 6 */
   double avg=(n1+n2+n3)/3;
  System.out.println("average "+avg);

/*3Write a Java method to display the middle character of a string.*/
System.out.println("enter A string");
String str=I.nextLine();
System.out.println("Middle character "+ getmiddle(str));


    }
    public static int smller(int n1,int n2,int n3){
        return Math.min(Math.min(n1,n2),n3);

    }
    public static int largest(int n1,int n2 ,int n3){
        return Math.max(Math.max(n2, n3) ,n1);
    }
    public static String getmiddle(String s1){
        int length=s1.length();
        
       if(length==0){return "";}
       //for even length;
       if(length%2==0){
        int m1=length/2-1;
        int m2=length/2;
        return  s1.substring(m1, m2+1);
    }
    //for odd
    else{
        int mid=length/2;
        return String.valueOf(s1.charAt(mid));
    }
    }
}
