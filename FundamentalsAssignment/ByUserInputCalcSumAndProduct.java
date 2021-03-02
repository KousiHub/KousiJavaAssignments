package FundamentalsAssignment;

import java.util.Scanner;

public class ByUserInputCalcSumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Sum of 2 nos: "+(num1+num2));
        System.out.println("Product of 2 nos: "+(num1*num2));
        scanner.close();
    }
}
