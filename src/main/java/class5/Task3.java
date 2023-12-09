package class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter the current time");

       double HourNumber= scanner.nextDouble();
        if (HourNumber>=1 &&HourNumber<=11){
            System.out.println("Morning");
        } else if (HourNumber>=12 && HourNumber<=15) {
            System.out.println("Aftenoon");

        }else if (HourNumber>=16 && HourNumber<=20){
            System.out.println("Evening");

        } else if (HourNumber>=21 && HourNumber<=24) {
            System.out.println("Night");

        }else{
            System.out.println("invalid");
        }
    }
}


