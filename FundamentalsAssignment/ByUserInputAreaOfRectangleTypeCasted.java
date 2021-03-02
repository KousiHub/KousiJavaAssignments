package FundamentalsAssignment;

import java.util.Scanner;

public class ByUserInputAreaOfRectangleTypeCasted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and breadth of the rectanble in double values");
        double l = scanner.nextDouble();
        double b = scanner.nextDouble();
        int area = (int) (l*b);
        System.out.println("Area of rectangle type casted: "+area);
        scanner.close();
    }
}
