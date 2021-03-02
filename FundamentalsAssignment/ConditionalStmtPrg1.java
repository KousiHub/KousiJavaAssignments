package FundamentalsAssignment;

import java.util.Scanner;

public class ConditionalStmtPrg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and breadth of the rectangle");
        double l = scanner.nextDouble();
        double b = scanner.nextDouble();
        double area = l * b;
        double squareroot = Math.sqrt(area);
        if(squareroot - Math.floor(squareroot) == 0) {
            System.out.println("Area of rectangle is: " + area + " is a perfect square.");
        }
        else {
            System.out.println("Area of rectangle is: " + area + " is not a perfect square.");
        }
        scanner.close();
    }
}
