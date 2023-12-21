package class18;

public class Parent {

    void marry(){
        System.out.println("Marry the girl that we have selected for you");
    }
}
 class Karimi extends Parent{
void marry(){                                          //--> method overriding when we want to repeat same method
    System.out.println("I want to marry girl i love");   //again to child class to print out the child class first
}
 }

 class Tester{
     public static void main(String[] args) {

         Karimi k=new Karimi();
         k.marry();
     }
 }