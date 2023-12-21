package class18;

public class Animal {
    private String name;
    private String color;
    private int age;
    private double weight;

      public Animal (String name,String color, int age,double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;

    }
  public void sleep(){
        System.out.println("ZZZzzzzzZzzzz....");
    }
   public void speak(){
        System.out.println("Animal speaking");
    }
   public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}



class Dog extends Animal{
    Dog(String name,String color, int age,double weight){
        super(name,color,age,weight);

    }
    public void speak(){
        System.out.println("Wufff Wuff....");
    }
    void demo(String str){
        System.out.println(str);

    }
}