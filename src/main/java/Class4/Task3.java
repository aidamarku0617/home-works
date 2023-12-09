package Class4;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println(" please Enter the amount of loan amount");
        Scanner scanner=new Scanner(System.in);
        double loanAmount= scanner.nextInt();
        if (loanAmount<=200000) {
            System.out.println("You can get this loan");

        }else {
            System.out.println("this amount cant be provided");


        }
    }
}
