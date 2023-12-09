package Class4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(" Please Enter the city");

        Scanner scanner=new Scanner(System.in);
        String city= scanner.nextLine();
        System.out.println("Enter the temp in Fahrenheit");
        double fahrenheit= scanner.nextDouble();
        double celsius=(fahrenheit-32)*5/9.0;
        System.out.println("The temp in "+city+" is "+celsius+" degrees celsius");
    }

}
