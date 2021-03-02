package FundamentalsAssignment;

import java.util.Scanner;

public class LoopsPrg9 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        double prod = 1;
        double avg;
        String quitChar = "";
        Scanner scanner = new Scanner(System.in);

        while(!quitChar.equals("q")){
            System.out.println("Enter a number or q to quit");
            quitChar = scanner.next();

            if(!quitChar.equals("q")){
                int number = Integer.parseInt(quitChar);
                sum = sum + number;
                prod = prod * number;
                count++;
            }
        }
        if(count != 0) {
            System.out.println("Product is: " + prod + "\nAverage is: " + (sum / count));
        }
        scanner.close();
    }
}
