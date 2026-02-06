

public class binarytoInteger {
 public static void main(String[] args) {
    int bin=1011; // Example binary number
    double dec=0;
    int power=0;
    
    while(bin>0){
        int lastdigit=bin%10;
        dec = dec+lastdigit*Math.pow(2, power);
        power++;
        bin=bin/10;
    }
    System.out.println("Decimal value is: " + (int)dec);
 }   

}