package Class9;

public class T3 {
    public static void main(String[] args) {

        String[] [] students={
                {"Zahra", "Mia", "Hanane ","Aida"},
                           {"A","B","C","D"}};

for (int i=0; i<students[0].length; i++){
    if (students[1][i].equals("A") || students[1][i].equals("B")){
        System.out.println(students[0][i]+" " +students[1][i]);
    }

}
    }
}
