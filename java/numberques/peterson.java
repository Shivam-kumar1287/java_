package numberques;
/*
Peterson Number
A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself. */
public class peterson {

    public static boolean pet(int n){
        int s = 0;
        int f = n;
        while (n > 0) {
            int r = n % 10;  // Get the last digit
            s += fact(r);    // Add the factorial of the digit to s
            n /= 10;         // Remove the last digit
        }
        return f == s;  // If sum of factorials equals the original number, return true
    }

    public static int fact(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {  // Loop until i <= n to calculate factorial
            f *= i;
        }
        return f;
    }

    public static void main(String[] args){
        System.out.println("These are peterson nnumber :)");
        for(int i=1;i<100000000;i++)
        if (pet(i)) {
            System.out.println(i);
        } 
    }
}
