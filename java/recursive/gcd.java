import java.util.Scanner;

class gcd{
    public int computeGCD(int a, int b){
        if(b == 0){
            return a;
        }
        return computeGCD(b, a % b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        gcd gcdCalculator = new gcd();
        int result = gcdCalculator.computeGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
        scanner.close();
    }
}