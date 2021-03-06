package Level2FundamentalAssignment;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0;
        if((num > 0) && (num < 9)){
            System.out.println("Sum of the digits of the given number: " +num);
        }
        else {
            while (num != 0)
            {
                sum = sum + num % 10;
                num = num/10;
            }
            System.out.println("Sum of the digits of the given number: " +sum);
        }
    }
}
