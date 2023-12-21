package class15;

public class T1 {

    T1(){
        System.out.println("Empty");
    }
    T1(String s){
        System.out.println("With one parameter");
    }


    public static void main(String[] args) {
        new T1();
        new T1("str");
    }
}
