package FundamentalsAssignment;

import java.util.Scanner;

public class ConditionalStmtPrg11 {
    public static void main(String[] args) {
        System.out.println("Enter any character");
        Scanner scanner = new Scanner(System.in);
        char character = scanner.next().charAt(0);
        if (character >= 'A' && character <= 'Z') {
            System.out.println("\n" + character + " is an UpperCase character");
        }
            else if (character >= 'a' && character <= 'z') {
            System.out.println("\n" + character + " is an LowerCase character");
        }
            else
        {
            System.out.println("Invalid char");
        }
        scanner.close();
    }
}
