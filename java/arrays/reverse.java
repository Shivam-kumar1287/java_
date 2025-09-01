package arrays;

public class reverse {
    public static void rev(int num[]){
        int s=0,e=num.length-1;
        while (s<=e) {
               int temp=  num[s];
               num[s]=num[e];
               num[e]=temp;
               s++;
               e--;
        }
    }
    public static void main(String[] args){
        int num[]={1,2,3,4,5};
        rev(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] +" ");
        }
    System.out.println();
    }
}
