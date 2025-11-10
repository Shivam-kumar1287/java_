public class slowfast{
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int slow=0;
        int fast=0;
        int n=arr.length;
        System.out.println("method  Array:");
        while(slow<n && fast<n){
            System.out.println("Slow: "+slow+" Fast: "+fast);    
            slow++;
            fast+=2;
        }
        while(fast<arr.length-1){
            fast++;
            if(arr[fast]%2==0){
                int temp=arr[slow];
                arr[slow]=arr[fast];
                arr[fast]=temp;
                slow++;
            }
        }
            for(int num:arr){
            System.out.print(num+" ");
        }
    }
}