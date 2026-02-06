import java.util.*;

public class n {

    public static void main(String[] args) {
        int number = 12345;
        int result = reverseNumber(number);
        System.out.println("Reversed number of " + number + " is: " + result);
    }

    public static int reverseNumber(int n) {
        List<Integer> digits = new ArrayList<>();

        while (n > 0) {
            int num=(n % 10);
            if(num%2==0){
                digits.add(num);
            }
            n = n / 10;
        }

        int reversedNum = 0;
                Collections.reverse(digits);
        for (int digit : digits) {
            reversedNum = reversedNum * 10 + digit;
        }

        return reversedNum;
    }
}
