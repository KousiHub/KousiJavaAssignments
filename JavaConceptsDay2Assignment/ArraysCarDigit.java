package JavaConceptsDay2Assignment;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class ArraysCarDigit {
    public static void main(String[] args) {
        System.out.println("Enter count of car numbers to be printed");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] randNumToCheck = new int[count];
        String[] numBoard = new String[count];
        SecureRandom srNum = new SecureRandom();
        if(count < 1) {
            System.out.println("Entry not valid");
        }
        if(count == 1) {
            randNumToCheck[0] = srNum.nextInt();
            numBoard[0] = "MH" + randNumToCheck[0];
            System.out.println("Car Number: ");
            System.out.println(numBoard[0]);
        }
        if(count > 1) {
            for (int i = 0; i < count; i++) {
                randNumToCheck[i] = srNum.nextInt();
            }

            for(int i = 0; i < randNumToCheck.length; i++) {
                for(int j = 0; j < randNumToCheck.length; j++) {
                    if(i!=j) {
                        if (randNumToCheck[i] == randNumToCheck[j]) {
                            System.out.println("Duplicates generated");
                            System.out.println(randNumToCheck[j]);
                            break;
                        } else {
                            numBoard[i] = "MH" + randNumToCheck[i];
                        }
                    }
                }
            }
            System.out.println("Car Number: ");
            for (String num : numBoard) {
                System.out.println(num);
            }
        }
    }
}
