package class8;

public class T2 {
    public static void main(String[] args) {
        //
        int[] numbers={101,100,25,30,25,50,300};
        //to count how many numbers are divisible by
        //5 and how many are divisible by 2
        int n5=0,n2=0;
        for(int x:numbers){
            if(x%5==0){
                n5++;

            }
            if(x%2==0){
                n2++;
            }
        }
        System.out.println("The number of numbers divisible by 5 is "+ n5);
        System.out.println("The number of numbers divisible by 2 is "+ n2);
    }
}
