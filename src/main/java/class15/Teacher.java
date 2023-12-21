package class15;

public class Teacher {
    private String name;
    private String address;

    public Teacher(String name, String address){
        this.name=name;
        this.address=address;
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(address);
    }

    public static void main(String[] args) {
        Teacher t=new Teacher("Asghar", "123 mmm Streat");
        t.printInfo();

    }
}
