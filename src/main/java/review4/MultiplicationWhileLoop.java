package review4;

public class MultiplicationWhileLoop {
    public static void main(String[] args) {
        System.out.println("-------------MULTIPLICATION TABLE-------------");
        for(int i=1; i<=10; i++){
            for (int j=1; j<=10; j++){
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println("---------------------------");
        }
    }
}
