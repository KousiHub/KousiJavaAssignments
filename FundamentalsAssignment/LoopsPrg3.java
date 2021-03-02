package FundamentalsAssignment;

import java.util.Scanner;

public class LoopsPrg3 {
    public static void main(String[] args) {
        int rows, i, j, gap = 1;
        System.out.print("Enter the number of rows");
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        gap = rows - 1;
        for (j = 1; j<= rows; j++)
        {
            for (i = 1; i<= gap; i++)
            {
                System.out.print(" ");
            }
            gap--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        gap = 1;
        for (j = 1; j<= rows - 1; j++)
        {
            for (i = 1; i<= gap; i++)
            {
                System.out.print(" ");
            }
            gap++;
            for (i = 1; i<= 2 * (rows - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
