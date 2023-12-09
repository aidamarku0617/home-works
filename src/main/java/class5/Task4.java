package class5;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the month you were born");

        String Bday=scanner.next();
         String seasson;
        if  (Bday.equals("march|| april ||may")){
           seasson="Spring";
        } else if (Bday.equals("June || July || August")) {
            seasson="Summer";

        } else if (Bday.equals("September || October|| November")) {
            seasson="Fall";

        } else if (Bday.equals("December || January|| February")) {
            seasson="Winter";
            System.out.println("You were born in" +seasson);
        }

    }
}
