package FundamentalsAssignment;

import java.util.Scanner;

public class ConditionalStmtPrg2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 values");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if(n1 > n2) {
            System.out.println(n1 + " is the biggest");
        }
        else {
            System.out.println(n2 + " is the biggest");
        }
        scanner.close();
    }
}
