package class17;

public class Parent {

    String name="Israel";

}
class Child extends Parent{
    String name="Maria";

    void print(){

        String name="Levi";
        System.out.println(name);//if we put this. will be print maria, if we put super.name will print parent name
    }
}
class Tester{
    public static void main(String[] args) {
        Child c=new Child();
        c.print();
    }
}