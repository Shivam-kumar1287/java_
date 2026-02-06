public class Binary {

    public static void main(String[] args) {
        int number = 10;
        int result = getBinary(number);
        System.out.println("Binary of " + number + " is: " + result);
    }

    public static int getBinary(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 2) + 10 * getBinary(n / 2);
        }
    }
}
