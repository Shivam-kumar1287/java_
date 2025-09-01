package arrays;

public class subarray {
    public static void sumake(int num[]){
      for( int i=0;i<num.length;i++){
         int start=i;
        for(int j=i;j<num.length;j++){
          int end=j;
          for(int k=start;k<end;k++){
            System.out.print(num[k]+" ");
          }
          System.out.println();
        }
      }
    }


 public static void sumnew(int num[])   {
  int maxsum=Integer.MIN_VALUE;
  for(int i=0;i<num.length;i++){
    int currsum=0;
    for(int j=0;j<num.length;j++){
        currsum+=num[j];
      if(maxsum<currsum){
        maxsum=currsum;
      }
    }
    System.out.print(maxsum+"\t");

  }
  System.out.println("max sum "+maxsum);
 }
  public static void main(String[] args)   {
    int num[]={2,4,8,6,10};
    sumake(num);
    sumnew(num);

  }
}
