package JavaConceptsDay2Assignment;

import java.util.Random;
import java.util.Scanner;

public class ArraysGrades {
    public static void main(String[] args) {
        System.out.println("Enter number of grades required:");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        double[] grades = new double[count];
        double sum = 0.0;
        double avg = 0.0;
        double max,min;

        if(count > 0) {
            System.out.println("Enter the grades");

            for (int i = 0; i < count; i++) {
                grades[i] = scanner.nextDouble();
            }
            for (double num : grades) {
                //System.out.println(num);
                sum = sum + num;
            }
            avg = sum / count;
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + avg);

            //Max and Min Values
            max = grades[0];
            for (int i = 0; i < count; i++) {
                if (max < grades[i]) {
                    max = grades[i];
                }
            }
            System.out.println("Maximum value entered:" + max);

            min = grades[0];
            for (int i = 0; i < count; i++) {
                if (min > grades[i]) {
                    min = grades[i];
                }
            }
            System.out.println("Minimum value entered:" + min);
        }
        else
        {
            System.out.println("Entry not valid");
        }
    }
}
