package class14;

import org.jetbrains.annotations.NotNull;

public class T3 {
    int calculateSum(int @NotNull [] array){
        int sum=0;
        for (int num:array) {
            sum=sum+num;

        }
        return sum;
    }


    public static void main(String[] args) {
        T3 t3=new T3();
        int [] array={2,4,5,7,9,1};
        int sum= t3.calculateSum(array);
        System.out.println("Sum "+sum);
    }
}
