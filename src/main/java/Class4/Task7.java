package Class4;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of years you worked");
        int yearsWorked= scanner.nextInt();
        System.out.println("Enter the annual salary");
        double annualSalary= scanner.nextDouble();
        if (yearsWorked>=5) {
            if (annualSalary > 50000) {
                System.out.println("You are eligibile for a bonus of $5000");

            } else {
                System.out.println("You are elibigile for a bonus of $3000");


            }
        } else {
                System.out.println("Sorry you are not eligibile for a bonus");
            }
        }


    }




