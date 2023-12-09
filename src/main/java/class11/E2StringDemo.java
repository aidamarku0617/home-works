package class11;

public class E2StringDemo {
    public static void main(String[] args) {

// creating an object of String class
        String str = "Batch 18";//always we used in this way
        String str2 =new String("Batch 18");//but memory like this

        System.out.println(str.length());
        System.out.println(str2.length());
         boolean isEmpty=str.isEmpty();
        System.out.println(isEmpty);

    }
}