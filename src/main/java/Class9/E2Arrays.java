package Class9;

public class E2Arrays {
    public static void main(String[] args) {

        int[][] matrix={
                {10,20,50},//>>>rows
                {25,35,66},
                {80,90,78,45},
                {45,55,66}

        };
        System.out.println(matrix[1][1]);//output 35
        System.out.println(matrix[0][2]);//50
        System.out.println(matrix[3][2]);//66


        System.out.println(matrix.length);//is going to give us number of rows 4

        System.out.println(matrix[0].length);//3(elements in row 0)
        System.out.println(matrix[2].length);//4 (elements in row 2)
    }
}
