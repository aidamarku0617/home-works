package class14;

public class TestSyntaxEmployee {
    public static void main(String[] args) {
       SyntaxEmployee empl1=new SyntaxEmployee();
        empl1.empId="max";
        empl1.salary=2500;
        System.out.println(empl1.empId);
        System.out.println(empl1.salary);
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee empl2= new SyntaxEmployee();
        empl2.empId="min";
        empl2.salary=1000;
        System.out.println(empl2.empId);
        System.out.println(empl2.salary);
        System.out.println(SyntaxEmployee.CEO);
    }
}
