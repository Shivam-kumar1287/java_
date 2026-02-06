public abstract class factt {
    public static void main(String[] args) {
        int number = 21; // Example number to compute factorial
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static int factorial(int n){
        if(n==0 | n==1){
            return 1;
        }
        
        return n*factorial(n-1);
        
    }
}
