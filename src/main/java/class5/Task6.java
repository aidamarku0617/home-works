package class5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the name of your country");
       String country=scanner.nextLine();
        switch (country.toLowerCase()) {
            case ("Usa"):
                System.out.println("English");
                break;
            case ("Italy"):
                System.out.println("Italian");
                break;
            case ("Portugal"):
                System.out.println("Portuguese");
                break;
            case ("Mexico"):
                System.out.println("Spanish");
            case ("Albania"):
                System.out.println("Albanian");
                break;
            default:
                System.out.println("Invalid");

        }


    }
}
