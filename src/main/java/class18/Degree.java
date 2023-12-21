package class18;

public class Degree {
    public void getPrerequisite(){
        System.out.println("To get e degree, you need a hight school diploma");
    }

    public static void main(String[] args) {

    }
}
class Bachelor extends Degree{

}
class Master extends Degree{

    public void getPrerequisite(){
        System.out.println("To get a master degree you need a bachelor's degree");
    }
}

