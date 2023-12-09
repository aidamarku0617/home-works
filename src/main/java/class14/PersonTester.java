package class14;

public class PersonTester {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Zeshan";
        p1.age=22;
        p1.weight=60;
        p1.printInfo();


        Person p2=new Person();
        p2.name="Sino";
        p2.age=25;
        p2.weight=124;
        p2.printInfo();
        System.out.println(p2.noOfEye);

    }
}
