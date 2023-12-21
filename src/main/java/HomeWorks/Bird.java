package HomeWorks;

public class Bird {
    //Create a Bird class create 4 fields and use the
    //Bird class as parent class and create 2 classes
    //Using it one sparrow and one parrot use constructors
    // make fields private and define printInfo methods as well create the object
    // of each class and call the method

    private String species;
    private String color;
    private int age;
    private boolean canFly;

    public Bird(String species, String color, int age,boolean canFly){
        this.species=species;
        this.age=age;
        this.color=color;
        this.canFly=canFly;
    }
    public void printInfo(){
        System.out.println("species " +species);
        System.out.println("Color "+color);
        System.out.println("Age "+age);
        System.out.println("Can fly "+canFly);
    }

    public static void main(String[] args) {
        Sparrow sp = new Sparrow("Brown", 2);
        sp.printInfo();
        System.out.println();
        Parrot parrot = new Parrot("Green", 5);
        parrot.printInfo();
    }
}
class Sparrow extends Bird{
    public Sparrow(String color,int age){
        super("Sparrow",color,age,true);
    }
}
class Parrot extends Bird{
    public Parrot(String color,int age){
        super("Parrot",color,age,true);
    }
}

