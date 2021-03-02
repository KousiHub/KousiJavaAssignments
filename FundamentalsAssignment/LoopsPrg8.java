package FundamentalsAssignment;

import java.util.Scanner;

public class LoopsPrg8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int n1 = num1;
        int n2 = num2;
        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println("Greatest Common Divisor of " +num1+ " and "+num2+ ": " + n1);
    }
}
