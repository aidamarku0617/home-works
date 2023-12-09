package class5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double quizMarks, midiMarks,finalMarks,avgMarks;
        char grade;
        System.out.println(" please Enter the mark for quiz score");
        quizMarks= scanner.nextDouble();
        System.out.println(" please Enter the mark for midterm score");
        midiMarks= scanner.nextDouble();
        System.out.println(" please Enter the mark for final score");
        finalMarks= scanner.nextDouble();
        avgMarks=(quizMarks+midiMarks+finalMarks)/3;

        if (avgMarks>=90){
            grade='A';
        } else if (avgMarks>=70 ) {
            grade = 'B';
        } else if (avgMarks>=50) {
            grade='C';

        }else {
            grade='F';
        }
        System.out.println(grade);
    }


    }

