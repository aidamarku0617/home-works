package Class4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("What is your age");
        Scanner scanner=new Scanner(System.in);
         int age= scanner.nextInt();

        if (age>=18) {
            System.out.println("You will issue a driver license ");
        }else{
            System.out.println("You will offer them to get a learners permit");

        }
    }
}
