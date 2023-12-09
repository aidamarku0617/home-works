package class11;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter username");

        String username=scanner.nextLine();
        System.out.println("Enter password");

        String password= scanner.nextLine();
        String confirmPasword= scanner.nextLine();
        String message="";

        if(username.isEmpty() || password.isEmpty()){
            message="Username or Password cannot be empty";

        } else if (password.length()<8) {
            message="Password is to short";


        } else if (password.contains(username)) {
            message="Password can not contain username";

        } else if (! password.equals(confirmPasword)) {
            message="Your username and password has been created";

        }
        System.out.println(message);
    }

}
