package Review6;

public class E12StringDemo {
    public static void main(String[] args) {
        String str="My name is James my number is 91245687";
        String number=str.replaceAll("[^0-9]","");//replace all sentence exept numbers will this method
        System.out.println(number);
        StringBuilder stringBuilder=new StringBuilder("Java");
        System.out.println(stringBuilder);
    }
}
