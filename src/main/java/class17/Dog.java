package class17;
class Animal{
  private  String name;
    private String color;
    private  int age;
    private double weight;
    public Animal(){//we put public parent class to be accessed to other classes

    }
    public Animal(String name,String color,int age,double weight){
      this.name=name;
      this.color=color;
      this.age=age;
      this.weight=weight;


    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
public class Dog extends Animal {
  Dog(String name,String color,int age,double weight){
    super(name, color, age, weight);
  }

}
 class cat extends Animal{
cat(){

}
}