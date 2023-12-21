package class19;

public class E2Poly {
    public static void main(String[] args) {
        Dog d1=new Dog("Jacky","Balck",10,25);
        Dog d2=new Dog("Macky","Brown",10,25);
        Cat c1=new Cat("Jacky","Balck",10,25);
        Animal a1=new Animal("Jacky","Balck",10,25);

        Animal [] arr={d1,d2,c1,a1};
        Animal a2=arr[0];
        a2.PrintInfo();

    }
}
