package Review6;

public class E6StringDemo {
    public static void main(String[] args) {
        String str="Today is JAVA review class";
        System.out.println(str.charAt(6));//str.charAt() is for index
        //to put nr of letter in string,for example index6 is letter (i).
        str=str.toLowerCase();//convert the letters to lower case
        int counter=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println("Letter a appeared "+counter+" times");
    }

}
