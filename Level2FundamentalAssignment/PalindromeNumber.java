package Level2FundamentalAssignment;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        int rem, rev = 0;
        if((n>=0) && (n<10))
        {
            System.out.println("Enter num is a palindrome since the reverse of it is: "+n);
        }
        else{
            while(temp > 0) {
                rem = temp % 10;
                rev = (rev*10) + rem;
                temp = temp / 10;
            }
            if(n == rev) {
                System.out.println("Enter num is a palindrome since the reverse of it is: " + rev);
            }
            else{
                System.out.println("Enter num is not a palindrome since the reverse of it is: "+rev);
            }
        }
    }
}
