import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
         Scanner Input = new Scanner(System.in);
        
        System.out.println("Size of array:");
        int s = Input.nextInt();
        int arr[] = new int[s];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < s; i++) {
            arr[i] = Input.nextInt();
        }

        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Acendnding order");
        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }
for(int i=0 ;i<s;i++){
    for(int j=0;j<s;j++){
        if(arr[i]>arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
System.out.println("desending order");
for(int i=0;i<s;i++){
    System.out.print(arr[i]+" ");
}


    }
}
