public class powerbase {
    public static void main(String[] args) {
        int base = 2; // Example base
        int exponent = 5; // Example exponent
        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

    }   
    public static int power(int base,int exponent){
        if(exponent==0){
            return 1;
        }
        if(exponent==1){
            return base;
        }
        return base*power(base, exponent-1);
    }

}
