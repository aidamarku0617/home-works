package Class9;

public class T5 {
    public static void main(String[] args) {

        int [][] numbers={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println("Even numbers");
        for(int i=0; i< numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
        }


    }
}
