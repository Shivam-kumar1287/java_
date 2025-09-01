package numberques;

import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Eanter a 2 to n number");
        int num=input.nextInt();
        int l=0,i,flag=0;
        l=num/2;
        if(num==0 || num==1){
            System.out.println(num+"is not prime nuber");;
        }
        else{
            for(i=2;i<=l;i++){           
        if(num%i==0){
            System.out.println(num+"is not prime number");
            flag=1;
            break;
        }
    }
    if(flag==0)
{System.out.println(num+" is a Prime number"); }

}


    }
}
