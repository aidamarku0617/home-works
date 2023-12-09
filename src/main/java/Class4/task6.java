package Class4;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have a credit card");

        String status = scanner.nextLine();
        double balance = 1000;

        if (status.equals("No")) {
            System.out.println("Would you like one");
        } else if (status.equals("Yes")) {
            System.out.println("Whats your balance on the card? ");
            if (balance >= 1000) ;
            {
                System.out.println("Pay off your balance");

            }
        }else{
                System.out.println("you can spend more");



        }

    }
}