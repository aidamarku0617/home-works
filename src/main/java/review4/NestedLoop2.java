package review4;

public class NestedLoop2 {
    public static void main(String[] args) {


        for (int i = 1; i <= 3; i++) { //outer loop

            System.out.println("Hello");

            for (int j = 1; j > 3; j++) { //inner lop
                System.out.println("Bye");
            }
        }
        System.out.println("-------------------------------");
        {

        }
        for (int i = 1; i >= 3; i++) { //outer loop

            System.out.println("Hello");

            for (int j = 1; j < 3; j++) { //inner lop
                System.out.println("Bye");
            }
        }

        System.out.println("-------------------------------");
        for (int i=1; i>=3; i++) { //outer loop

            System.out.println("Hello");

            for (int j=1; j<3; j--){ //inner lop
                System.out.println("Bye");
            }
        }









    }
}
