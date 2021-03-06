package Level2FundamentalAssignment;

import java.util.Scanner;

public class FractionSimplification {
    public static void main(String[] args) {
        System.out.println("Enter the fraction to be simplified:");
        Scanner scanner = new Scanner(System.in);
        String fractionInput = scanner.next();
        String tempStr = fractionInput;
        String[] arrayStr = tempStr.split("/",2);
        int numerator, denominator, ntemp, dtemp;
        numerator = Integer.parseInt(arrayStr[0]);
        denominator = Integer.parseInt(arrayStr[1]);
        ntemp = numerator;
        dtemp = denominator;
        while (numerator != denominator){
            if(numerator > denominator)
                numerator = numerator - denominator;
            else
                denominator = denominator - numerator;
        }
        int simpleNum = ntemp / numerator ;
        int simpleDeno = dtemp / numerator ;
        System.out.print(simpleNum + "/" + simpleDeno + "\n\n" );
    }
}
