package review5;

import java.util.Scanner;

public class E10ArraysScanner {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the Array");
        int size= sc.nextInt();
        int [] numbers=new int[size];
        System.out.println(numbers.length);
    }
}
