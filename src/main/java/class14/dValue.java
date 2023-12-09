package class14;

public class dValue {
    public static int dValue (int number){
        int result=number*2;
        return result;
    }


    public static void main(String[] args) {
        int inputNumber=5;
        int doubledValue=dValue(inputNumber);
        System.out.println(doubledValue);
    }
}
