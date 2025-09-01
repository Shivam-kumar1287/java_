class q11{
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,5};
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                System.out.println(arr[i]);
            }
        }
    }
}