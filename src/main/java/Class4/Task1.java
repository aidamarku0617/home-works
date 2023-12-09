package Class4;

public class Task1 {
    public static void main(String[] args) {

        int age=20;
        int weight=125;

        if (age>=18){

            if(weight>110){
                System.out.println("He/She is eligibility to donate blood");
            }else{
                System.out.println("You are not eligibility to donate blood");
            }
        } else{

            System.out.println("We can not accept such a pattient");
        }
    }

}
