package c;

import java.util.Scanner;

class Point {
    public int a, b;

    // Constructor with parameters
    public Point(int x, int y) {
        this.a = x;
        this.b = y;
    }

    // Default constructor
    public Point() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        this.a = scanner.nextInt();
        this.b = scanner.nextInt();
    }

    // Method to add two points
    public Point add(Point obj) {
        return new Point(this.a + obj.a, this.b + obj.b);
    }

    // Method to display the point
    public void display() {
        System.out.println("(" + a + ", " + b + ")");
    }
}

public class q1 { // Class names should start with an uppercase letter
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a NUM (Range should be between 1 to 3):");
        int n = scanner.nextInt();

        // Validate input range
        if (n < 1 || n > 3) {
            System.out.println("Invalid range");
            return;
        } else {
            System.out.println("Your range is valid");
        }

        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(); // Calls the default constructor
        }

        Point result = new Point(0, 0);
        switch (n - 1) { // Adjusted switch statement
            case 0:
                points[0].display();
                break;
            case 1:
                result = points[0].add(points[1]);
                result.display();
                break;
            case 2:
                result = points[0].add(points[1]).add(points[2]);
                result.display();
                break;
        }

        scanner.close();
    }
}
