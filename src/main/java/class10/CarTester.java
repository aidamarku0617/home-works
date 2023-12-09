package class10;

public class CarTester {
    public static void main(String[] args) {
//create an object from the class

        Car bmw=new Car();
        bmw.model="17";
        bmw.color="Blue";
        bmw.make="BMW";
        bmw.price=120000;
        bmw.drive();
        bmw.ApplyBrake();
        bmw.honk();
    }
}
