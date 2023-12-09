package class14;

public class Cat {
    String name="Kitti";//--->instance variable
    void printname(){//--->local variable
        String name="Pishak";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.printname();
    }
}
