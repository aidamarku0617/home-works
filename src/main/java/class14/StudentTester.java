package class14;

public class StudentTester {
    public static void main(String[] args) {

        Students class1=new Students();
        class1.name="Batch18";
        class1.id=10;
        class1.numberOfStudents=20;
        System.out.println(class1.name);
        System.out.println(class1.id);
        System.out.println(class1.numberOfStudents);

        Students class2=new Students();
        class2.name="Batch17";
        class2.id=11;
        class2.numberOfStudents=30;
        System.out.println(class2.name);
        System.out.println(class2.id);
        System.out.println(class2.numberOfStudents+1);


    }
}
