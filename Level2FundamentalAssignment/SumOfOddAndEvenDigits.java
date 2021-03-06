package Level2FundamentalAssignment;

import java.util.Scanner;

public class SumOfOddAndEvenDigits {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner s = new Scanner((System.in));
        int num = s.nextInt();
        getSum(num);
    }

    private static void getSum(int n) {
        n = reverse(n);
        int sumOdd = 0, sumEven = 0, r = 1;
        while (n != 0) {
            if (r % 2 == 0)
                sumEven += n % 10;
            else
                sumOdd += n % 10;
            n /= 10;
            r++;
        }
        System.out.println("Sum odd = " + sumOdd);
        System.out.println("Sum even = " + sumEven);
    }
    static int reverse(int n)
    {
        int rev = 0;
        while (n != 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
    }
}
