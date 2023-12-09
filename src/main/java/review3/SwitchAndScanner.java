package review3;

import java.util.Scanner;

public class SwitchAndScanner {
    public static void main(String[] args) {
        Scanner capture=new Scanner(System.in);
        System.out.println("Please enter where are you from");
       String country=capture.nextLine();

       switch(country.toLowerCase()){
           
           case"India":
               System.out.println("You love biriyani");
               break;
           case "Egypt":
               System.out.println("You love Koshari");
               break;
           case "Georgia":
               System.out.println("You love Hachapuri");
               break;
           case "Moldova":
               System.out.println("You love Mamaliga");
               break;
           case "Kazakhistan":
               System.out.println("You Love beshparmark");
               break;
           case "USA":
               System.out.println("You love burger and friench frise");
               break;
           case "Great Britain":
               System.out.println("You love chips and fish");
               break;
           default:
               System.out.println("I dont know your favorite food");
       }

    }
}
