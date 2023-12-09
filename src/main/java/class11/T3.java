package class11;

public class T3 {
    public static void main(String[] args) {

        String str="Hello";
        if(!str.isEmpty()){
            int length=str.length();
            if (length % 2!=0 && length>=3){
                int middleindex=length/2;
                char middleChar=str.charAt(middleindex);
                System.out.println("Middle character " +middleChar);
            }
        }
    }
}
