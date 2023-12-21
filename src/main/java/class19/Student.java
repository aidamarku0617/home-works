package class19;

public class Student {
    String name;
    int age;

    public void study(){
        System.out.println("student is studying");
    }
    public void attendClasses(){
        System.out.println("student is attending classes");
    }
    public void takeExams(){
        System.out.println("student is taking exams");
    }

    public static void main(String[] args) {

    }
}
class SyntaxStudent extends Student{
    @Override
    public void study() {
        System.out.println("Syntax students are studying java" );
    }
    public void doHomework(){
        System.out.println("syntax student is doing home work");
    }
}
class CallegeStudent extends Student{
    public void attendClasses(){
        System.out.println("college student is studying in college");
    }
}
class SchoolStudent extends Student{
    public void takeExams(){
        System.out.println(" school student is takind school exams");
    }
}

