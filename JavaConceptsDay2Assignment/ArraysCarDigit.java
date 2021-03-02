package JavaConceptsDay2Assignment;

import java.util.Random;
import java.util.Scanner;

public class ArraysCarDigit {
    public static void main(String[] args) {
        System.out.println("Enter count of car numbers to be printed");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        String[] numBoard = new String[count];
        Random r = new Random();
        for (int i = 0; i < count; i++)
        {
            numBoard[i] = "MH" + r.nextInt();
        }
        for(String num:numBoard)
        {
            System.out.println(num);
        }
    }
}
