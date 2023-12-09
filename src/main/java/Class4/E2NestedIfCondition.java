package Class4;

public class E2NestedIfCondition {

    public static void main(String[] args) {

        double budget = 25000;
        String enginetype = "Hybrid";
        if (budget >= 50000) {

            if (enginetype.equals("Electric")) {
                System.out.println("I want to buy a tesla");

            } else if (enginetype.equals("Hybrid")) {
                System.out.println("I want to buy a toyota");

            } else {
                System.out.println("I want to buy Porche");


            }

        } else if (budget >= 30000) {
            if (enginetype.equals("Electric")) {
                System.out.println("I want to buy Byd");

            } else if (enginetype.equals("Hybrid")) {
                System.out.println("I want to buy Camry");


            } else {
                System.out.println("Honday Sonata");
            }
        } else if (budget>=20000) {

            if (enginetype.equals("Electric")) {
                System.out.println("nissan leaf");
            } else if (enginetype.equals("Hybrid")) {
                System.out.println("Kia");

            } else {
                System.out.println("Honda civic");

            }
        }else{
            System.out.println("Lets save more");

        }


    }
}









