package Class9;


public class Task2 {
    public static void main(String[] args) {


        int[][] matrix= {
                {10, 20, 50},//>>>>row
                {25, 35, 66},
                {80, 90, 78, 45},
                {45, 55, 66}
        };
        for(int i=0; i<matrix.length; i++){
            int sum=0;
            for(int j=0; j<matrix.length-1; j++){
                sum=sum + matrix[i][j];
            }
            System.out.println(sum);
        }

    }
}
