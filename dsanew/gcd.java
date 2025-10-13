public class gcd {
    public static void main(String[] args) {
        int a = 60, b = 48;

        System.out.print("Factors of " + a + ": ");
        printFactors(a);

        System.out.print("Factors of " + b + ": ");
        printFactors(b);

        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    public static void printFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
      }

    public static int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}
