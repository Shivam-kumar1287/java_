import java.util.*;

import javax.swing.plaf.synth.SynthLookAndFeel;
public class largest {
    
    public static int getlargets(int num[]){
        int l=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(l< num[i]){
                l= num[i];
            }
           
        }
        return l;
    }
    public static int getsamllest(int num[]){
        int s=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(s>num[i]){
                s=num[i];
            }
        }
        return s;

    }
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);
        int n =sc.nextInt();
int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]= sc.nextInt();

        }

        System.out.println("largest value is :"+ getlargets(num));
        System.out.println("Samllest value is :"+getsamllest(num));
    }

}
