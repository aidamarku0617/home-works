package class12;

public class T2 {
    public static void main(String[] args) {

        String str="ABCdhij@#$1234alphabetA";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());
    }
}
