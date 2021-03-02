package FundamentalsAssignment;

import java.util.Scanner;

public class LoopsPrg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int num;
        int totalcnt = 10;
        int sum = 0;
        double avg = 0.0;
        for (int i=1; i<=totalcnt; i++)
        {
            num = scanner.nextInt();
            sum = sum + num;
        }
        avg = sum/totalcnt;
        System.out.println("The Sum of integers = "+sum);
        System.out.println("The Average = "+avg);

        scanner.close();
    }
}
