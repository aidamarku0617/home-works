package class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the person's height in inches");
        int height= scanner.nextInt();

        if (height<60){
            System.out.println("The person is clasified as short");
        }else if(height >=60&& height<=72){
            System.out.println("The person is clasified as medium");
        }else{
            System.out.println("The person is clasified as tall");
        }
    }
}
