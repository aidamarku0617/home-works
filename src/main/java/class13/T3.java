package class13;

public class T3 {

    void isPalidrome(String str){
        String reversedWord=" ";
        for (int i =str.length()-1; i>=0 ; i--) {
            reversedWord=reversedWord+str.charAt(i);
        }
        if(str.equalsIgnoreCase(reversedWord)){
            System.out.println(str);
            System.out.println("Its a palidrome");

        }else{
            System.out.println(str);
            System.out.println("Its not a Palidrome");
        }
    }

    public static void main(String[] args) {
        T3 word=new T3();
        word.isPalidrome("Aida");
    }
}
