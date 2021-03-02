package FundamentalsAssignment;

import java.util.Scanner;

public class ConditionalStmtPrg4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter basic salary");
        double bpay = scanner.nextDouble();
        System.out.println("Enter years of service");
        double yrs = scanner.nextDouble();
        double bonus = bpay * 5/100;
        if(yrs > 5) {
            System.out.println("Bonus included is "+bonus+ "\n" + "Net Salary is: "+(bpay+bonus));
        }
        else {
            System.out.println("No Bonus for service less than 5 years. " + "\n" + "Net Salary is: "+bpay);
        }
        scanner.close();
    }
}
