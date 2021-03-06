package Level2FundamentalAssignment;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int i = 100, a, arm, n, temp;
        System.out.println("Armstrong numbers between 100 to 500 are as follows:");
        while(i < 500)
        {
            n = i;
            arm = 0;
            while(n > 0)
            {
                a = n%10;
                arm = arm+(a*a*a);
                n = n/10;
            }
            if(arm == i)
                System.out.println(i);
            i++;
        }
    }
}
