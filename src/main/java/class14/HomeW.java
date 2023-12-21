package class14;

public class HomeW {
    //Create a method that will accept an array as parameters and will return
    // a sum of all elements from that array.
    // Method should be visibly only within same package and accessible
    // by the creating an instance/object of the class.

    int sumArray(int[] arr){
        int sum=0;
        for (int num:arr) {
            sum=num+sum;
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] myArray={3,6,9,1,4};
        HomeW arr=new HomeW();
        int sum= arr.sumArray(myArray);
        System.out.println(sum);
    }
}
