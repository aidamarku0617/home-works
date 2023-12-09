package class14;

public class Dog {

    String name;
    void printInfo(){
        System.out.println(name);//instance variables
    }

    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.name="Jacki";
        d1.printInfo();
    }

}
