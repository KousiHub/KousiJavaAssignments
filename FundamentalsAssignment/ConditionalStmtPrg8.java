package FundamentalsAssignment;

import java.util.Scanner;

public class ConditionalStmtPrg8 {
    public static void main(String[] args) {
        //Get marks from user
        System.out.println("Enter the total number classes held");
        Scanner scanner = new Scanner(System.in);
        double totalClass = scanner.nextDouble();
        System.out.println("Enter the total number classes attended");
        double classAttended = scanner.nextDouble();
        double attendencePercent = (classAttended/totalClass) * 100;
        System.out.println("Attendence Percentage is: " +attendencePercent);
        if (attendencePercent >= 75)
            System.out.println("Enter the exam hall");
        else
            System.out.println("Entry not allowed");
        scanner.close();
    }
}
