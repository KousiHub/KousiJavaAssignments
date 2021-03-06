package Level2FundamentalAssignment;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year, temp, output;
        System.out.println("Enter any year");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if(year != 0)
        {
            output = (year%400 == 0)?(temp = 1):((year%100 == 0)?(temp = 0):((year%4 == 0)?(temp = 1):(temp = 0)));
            if(output == 1){
                System.out.println("Year: " +year+ " is a leap year");
            }
            else {
                System.out.println("Year: " +year+ " is a not leap year");
            }

        }
    }
}
