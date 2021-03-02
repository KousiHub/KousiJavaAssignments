package FundamentalsAssignment;

import java.util.Scanner;

public class ConditionalStmtPrg9 {
    public static void main(String[] args) {
        //Get marks from user
        System.out.println("Enter the total number classes held");
        Scanner scanner = new Scanner(System.in);
        double totalClass = scanner.nextDouble();
        System.out.println("Enter the total number classes attended");
        double classAttended = scanner.nextDouble();
        System.out.println("Enter any medical issues");
        String medical = scanner.next();
        double attendencePercent = (classAttended/totalClass) * 100;
        System.out.println("Attendence Percentage is: " +attendencePercent);

        if ((attendencePercent >= 75) && (medical.equals("no"))) {
            System.out.println("Enter the exam hall");
        }
        else if ((attendencePercent >= 75) && (medical.equals("no"))) {
            System.out.println("Entry not allowed");
        }
        else if ((attendencePercent < 75) && (medical.equals("no"))) {
            System.out.println("Entry not allowed");
        }
        else {
            System.out.println("Entry not allowed");
        }
        scanner.close();
    }
}
