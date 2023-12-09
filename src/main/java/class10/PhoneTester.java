package class10;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iphone = new Phone();
        iphone.make="Apple";
        iphone.model="Iphone 15 pro max";
        iphone.price=1500;
        iphone.color="silver";

        System.out.println(iphone.make);
        System.out.println(iphone.model);
        System.out.println(iphone.price);
        System.out.println(iphone.color);
        iphone.calls();
        iphone.takepics();
        iphone.playVideos();
    }



    }

