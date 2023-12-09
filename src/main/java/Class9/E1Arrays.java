package Class9;

public class E1Arrays {
    public static void main(String[] args) {
        int [] numbers={10,25,26,30,40,45,45};
        //initially storing the first number as previous
        int previous=numbers[0];
        boolean siSorted=true;
        for(int current:numbers){
            if(previous>current){
                siSorted=false;
                break;

            }
            previous=current;
        }
        System.out.println("Is array Sorted "+siSorted);
    }

}
