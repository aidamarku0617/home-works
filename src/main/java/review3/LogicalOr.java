package review3;

public class LogicalOr {
    public static void main(String[] args) {

        boolean rain = false;
        boolean cold = true;

        if (cold || rain) {
            System.out.println("I am staying home");
        }

        String welcomeMessage="Welcome Admin";
        boolean dashboardFormDisplayed=false;
        if (welcomeMessage.equals("Welcome Admin") || dashboardFormDisplayed){
            System.out.println("Admin user is succssfully logged in");
        }else{
            System.out.println("Canot login using admin credentials");
        }
    }
}