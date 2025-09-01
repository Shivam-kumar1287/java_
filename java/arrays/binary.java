package arrays;

public class binary {
    public static int bin(int num[],int k){
      int l=0;
      int hig=num.length;
        int mid=l+(hig-l)/2;

        while(l<=hig){
            int value=k;
            if(value<k){
                l=mid+1;
            }
            else if(value>k){
            hig=mid-1;
            }
            return  mid;
        }
        
        return -1;
    }
 public static void main(String[] args)   {
    int num[]={2,3,4,5,6,7,8};
    int k=8;
 int result = bin(num, k);  
        if (result != -1) {
            System.out.println("Element " + k + " found at index: ");
        } else {
            System.out.println("Element " + k + " not found.");
        } }
}
