package class12;

public class T3 {
    public static void main(String[] args) {

        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(" we have " +str.split("[?]").length+ " sentences");
    }
}
