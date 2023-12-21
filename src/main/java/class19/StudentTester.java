package class19;

public class StudentTester {
    public static void main(String[] args) {
        Student[] arr = {new Student(), new SyntaxStudent(), new CallegeStudent(), new SchoolStudent()};
        for (Student student : arr) {
            student.study();
            student.attendClasses();
            student.takeExams();
            if(student instanceof SyntaxStudent ){
                        SyntaxStudent s=  (SyntaxStudent)student;
                        s.study();
                    }

                }
            }
        }


