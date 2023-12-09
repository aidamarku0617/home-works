package class10;

public class PersonTester {
    public static void main(String[] args) {

        Person person1=new Person();
        person1.name="Aida";
        person1.gender="F";
        person1.age=34;

        System.out.println(person1.name);
        System.out.println(person1.gender);
        System.out.println(person1.age);

        person1.slep();
        person1.work();
        person1.kind();


    }
}
