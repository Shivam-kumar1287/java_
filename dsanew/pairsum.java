public class pairsum{

    public static void two2dapporach(int[] arr,int k){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==k){
                System.out.println("Pair found: ("+arr[l]+", "+arr[r]+")");
            }
            if(k>sum){
                l++;
            }
            else{
                r--;
            }

        }
    }
    public static void binaryserach(int[] arr,int k){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            int sum=arr[l]+arr[m];
            if(sum==k){
                System.out.println("Pair found: ("+arr[l]+", "+arr[m]+")");
            }
            if(k>sum){
                l=m+1;
            }
            else{
                r=m-1;
            }
            

        }
    }
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6};
    int k=7;
    System.out.println("Using two pointer approach:"+ two2dapporach(arr, k));
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==k){
                System.out.println("Pair found: ("+arr[i]+", "+arr[j]+")");
            }
        }

}

}
}