package Class6;

import java.util.Scanner;

public class E7ScanerAndLoop {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the starting poin");
        int start= sc.nextInt();
        System.out.println("Please enter the ending point");
        int end= sc.nextInt();
        while(start<=end){
            System.out.print(start+" ");
            start++;

        }
    }

}

