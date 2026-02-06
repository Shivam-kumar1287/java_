public class primefactor {
    public static void main(String[] args) {
        int number = 56; // Example number to compute prime factors
        System.out.print("Prime factors of " + number + " are: ");
        int res=printPrimeFactors(number);
        System.out.println(res);


    }
    public static int printPrimeFactors(int n){
        if (n>=2) {
            for(int i=2;i<=n;i++){
                while(n%i==0){
                    System.out.print(i + " ");
                    n/=i;
                }
            } 
        }
        return n;
    }
}
