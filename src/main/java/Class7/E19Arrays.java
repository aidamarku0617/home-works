package Class7;

public class E19Arrays {
    public static void main(String[] args) {
        int[] numbers={10,20,30,45,69,55,45,69,20};
        //this is how we can get the size of the array

        for (int i = 0; i<numbers.length; i++){
            if (numbers[i]== 55){
                System.out.println("Found");
                break;

            }
        }
    }
}
