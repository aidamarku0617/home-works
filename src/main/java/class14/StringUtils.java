package class14;

public class StringUtils {

    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.
    public  static String reversedString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        String originalString="Hello Java";
        String reversedString= StringUtils.reversedString(originalString);
        System.out.println("Original string "+originalString);
        System.out.println("Reversed String "+reversedString);
    }
}
