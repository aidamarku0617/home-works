package class16;

public class Teacher {
    String name;
    String object;
    int hoursOfTeaching;
    void tech(){
        System.out.println("Teaching.....");
    }
void joke(){
    System.out.println("hhahaha");
}
}
class MathTeacher extends Teacher{
    void teachMath(){
        System.out.println("Teaching math");
    }

}
class ChemistryTeacher extends Teacher{
    void teachChem(){
        System.out.println("HCL is salt");
    }
}
class PianoTeacher extends Teacher{
    void teachPiano(){
        System.out.println("Teaching piano");
    }
}