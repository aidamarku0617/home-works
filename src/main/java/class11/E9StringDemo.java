package class11;

public class E9StringDemo {
    public static void main(String[] args) {
        String str="Today is Saturday";
        System.out.println(str.substring(0,5));//Today
        System.out.println(str.substring(0,4));//Toda
        System.out.println(str.substring(6,8));//is
        System.out.println(str.substring(9,str.length()));// Saturday
        String str2="Java is Fun";
        System.out.println(str2.substring(0,str2.length()));
        System.out.println(str2.substring(0,4));
        System.out.println(str2.substring(5,7));



    }
}
