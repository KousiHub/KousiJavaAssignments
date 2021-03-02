package FundamentalsAssignment;

import java.util.Scanner;

public class ConditionalStmtPrg7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int input = scanner.nextInt();
        System.out.println("Output: "+Math.abs(input));
        scanner.close();
}
}
