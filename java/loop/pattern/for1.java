package loop.pattern;


import java.util.Scanner;
public class for1 {
    public static void main(String [] args){
        Scanner I=new Scanner(System.in);
        System.out.println("enter A number ");;
        int n=I.nextInt();
        for (int i = 0; i < n; i++) {
          for (int j = 0; j < n; j++) { // Change 'i' to 'j' in this loop
              System.out.print(j +" "); // Use print to stay on the same line
          }
          System.out.println();       }
      System.out.println("Second Pattern");;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) { // Change 'i' to 'j' in this loop
            System.out.print(i + " "); // Use print to stay on the same line
        }
        System.out.println(); // Move to the next line after the inner loop
    }


System.out.println("Thired Pattern");
for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) { 
      System.out.print("*" + " ");  }
  System.out.println();}


System.out.println("Fourth Pattern");
for (int i = 0; i < n; i++) {
  for (int j = 0; j < n; j++) { 
     System.out.print(j%2 + " ");}
  System.out.println(); }

System.out.println("Char Pattern ");
System.out.println("fiveth Pattern");
  for (char ch = 'A'; ch < 'A' + n; ch++) { 
    for (int i = 0; i < n; i++) { 
        System.out.print(ch+ ""); 
    }
    System.out.print("\n"); 

}
System.out.println("sixeth");

for (char ch = 'A'; ch < 'A' + n; ch++) { 
  for (int i = 0; i < n; i++) { 
      System.out.print(ch+ ""); 
  }
  System.out.print("\n"); 

}


        I.close();
}   
    


}
