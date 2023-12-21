package HomeWorks;

public class Vehicle {
    protected int speed;
    protected String color;
    protected String fuelType;
    public Vehicle(int speed, String color,String fuelType){
        this.speed=speed;
        this.color=color;
        this.fuelType=fuelType;

    }
    public void accelerate(){
        System.out.println("Vehicle is accelerating");
    }
    public void brake(){
        System.out.println("Vehicle is braking");
    }
}
class Car extends Vehicle{
    public Car(int speed,String color,String fuelType){
        super(speed, color, fuelType);
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void brake() {
        super.brake();
    }
}
class Truck extends Vehicle{
    public Truck(int speed,String color,String fuelType){
        super(speed, color, fuelType);
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
    public void loadCargo(){
        System.out.println("Truck is loading cargo");
    }
}
class Motorcycle extends Vehicle{
    public Motorcycle(int speed,String color,String fuelType){
        super(speed, color, fuelType);
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Motorcycle is braking");
    }
}
class Bycicle extends Vehicle{
    public Bycicle(int speed,String color,String fuelType){
        super(speed, color, fuelType);
    }

    @Override
    public void accelerate() {
        System.out.println("Bycicle is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Bycicle is braking");
    }
}
class Main{
    public static void main(String[] args){
        Car car=new Car(100,"red","Gasoline");
        Truck truck=new Truck(80,"Blue","Diesel");
        Motorcycle motorcycle=new Motorcycle(120,"Black","None");
        Bycicle bycicle=new Bycicle(20,"Yellow","None");

        //store them in array
        Vehicle[] vehicles={car,truck,motorcycle,bycicle};
        for(Vehicle vehicle:vehicles){
            vehicle.accelerate();
            vehicle.brake();
            System.out.println();
        }
    }
}