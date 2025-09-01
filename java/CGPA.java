import java.util.Scanner;

public class CGPA {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int num = sc.nextInt();
        double totalGradePoints = 0, totalCredits = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Enter the grade point for subject " + (i + 1) + ":");
            double gradePoint = sc.nextDouble();
            System.out.println("Enter the credit for subject " + (i + 1) + ":");
            double credit = sc.nextDouble();

            totalGradePoints += gradePoint * credit; // Multiply grade point by credit
            totalCredits += credit; // Sum up the credits
        }

        double cgpa = totalCredits > 0 ? totalGradePoints / totalCredits : 0; // Check to avoid division by zero
        System.out.printf("Total CGPA: %.2f\n", cgpa); // Format the output to 2 decimal places
    }
}
