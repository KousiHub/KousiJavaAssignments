package Level2FundamentalAssignment;

import java.util.Scanner;

public class EmployeeWorkingPlace {
    public static void main(String[] args) {
        System.out.println("Enter the name of the employee");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        System.out.println("Enter the sex");
        String sex = scanner.next();
        System.out.println("Enter the marital status");
        String maritalStatus = scanner.next();
        if(sex.contains("M"))
        {
            if((age > 20) && (age < 40))
            {
                System.out.println(name + " may work from anywhere!!");
            }
            else if((age > 39) && (age < 60))
            {
                System.out.println(name + " can work only in the urban areas!!");
            }
            else{
                System.out.println("ERROR");
            }
        }
        else if(sex.contains("F"))
        {
            System.out.println(name + " can work only in the urban areas!!");
        }
        else{
            System.out.println("ERROR");
        }
    }
}
