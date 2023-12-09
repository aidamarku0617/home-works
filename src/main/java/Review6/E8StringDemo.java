package Review6;

public class E8StringDemo {
    public static void main(String[] args) {

        String str="this one should be false";
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf("one"));//is going to return just letter 'o' so will be 5
        System.out.println(str.indexOf("is"));//output 2
        System.out.println(str.indexOf("z"));// output -1

    }
}
