package FundamentalsAssignment;

import java.util.Scanner;

public class ConditionalStmtPrg6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age of 1st person");
        int age1 = scanner.nextInt();
        System.out.println("Enter age of 2nd person");
        int age2 = scanner.nextInt();
        System.out.println("Enter age of 3rd person");
        int age3 = scanner.nextInt();

        if((age1 > age2) && (age1 > age3)) {
            System.out.println("Person 1 is the oldest");
        }
        else if ((age1 < age2) && (age2 > age3)) {
            System.out.println("Person 2 is the oldest");
        }
        else
            System.out.println("Person 3 is the oldest");

        if((age1 < age2) && (age1 < age3)) {
            System.out.println("Person 1 is the youngest");
        }
        else if ((age1 > age2) && (age2 < age3)) {
            System.out.println("Person 2 is the youngest");
        }
        else
            System.out.println("Person 3 is the youngest");

        scanner.close();
    }
}
