package JavaConceptsDay2Assignment;

import java.util.Scanner;

public class ArraysDaysOfWeek {
    public static void main(String[] args) {
        System.out.println("Enter the number to get the day:");
        Scanner scanner = new Scanner(System.in);
        int dayNum = scanner.nextInt();
        String[] dayNames = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if(dayNum < 7) {
            System.out.println("It is " + dayNames[dayNum]);
        }
        else {
            System.out.println("Sorry not a valid day number");
        }
    }
}
