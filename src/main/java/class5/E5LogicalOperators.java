package class5;

public class E5LogicalOperators {
    public static void main(String[] args) {

        boolean is4GAvbl=true;
        boolean isWfiAvbl=false;

        if (isWfiAvbl||is4GAvbl){
            System.out.println("You can browse the internet");
        }else{
            System.out.println("Cant use internet");
        }
    }
}
