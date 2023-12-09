package Class9;

public class T1 {
    public static void main(String[] args) {
        int[][] matrix= {
                {10, 20, 50},//>>>rows
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}
        };
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                sum=sum+ matrix[i][j];

            }
        }
        System.out.println("Sum of all elements " +sum);
    }
}
