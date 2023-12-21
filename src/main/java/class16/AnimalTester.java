package class16;

public class AnimalTester {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.name="Jacky";
        d.color="Brown";
        d.age=10;
        d.weight=22;
        d.printInfo();
        d.bark();


        Cat c=new Cat();
        c.name="Lulu";
        c.age=2;
        c.color="White";
        c.weight=3;
        c.sleep();
        c.printInfo();
    }
}
