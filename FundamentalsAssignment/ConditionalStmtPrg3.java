package FundamentalsAssignment;

import java.util.Scanner;

public class ConditionalStmtPrg3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total quantity required");
        int quantity = scanner.nextInt();
        int pricePerQuantity = 100;
        int totalPrice = quantity*pricePerQuantity;
        if(totalPrice > 1000)
        {
            System.out.println("Get a cashback of "+totalPrice*10/100 + " on your total cost " +totalPrice);
        }
        else
        {
            System.out.println("Your total cost = "+totalPrice+ " no cashback for amount below 1000");
        }
        scanner.close();
    }
}
