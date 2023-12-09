package Review6;

public class Person {
    //Atributes
    String name;
    int age;
    double weight;
    double height;

    //Behavior
    void eat(){
        System.out.println("Eating.......");
    }
    String getName(){
        return name;
    }

    public static void main(String[] args) {

         Person p=new Person();
         p.name="Aida";
         p.age=34;
         p.height=5.2;
         p.height=120;
        System.out.println(p.name);
        p.eat();
        String name=p.getName();
    }
}
