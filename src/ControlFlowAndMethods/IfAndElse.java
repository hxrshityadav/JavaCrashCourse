package ControlFlowAndMethods;

import java.util.Scanner;

public class IfAndElse {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = sc.nextInt();

        if(score >= 90){
            System.out.println("Grade: A");
        } else if(score >= 80){
            System.out.println("Grade: B");
        } else if(score >= 50){
            System.out.println("Grade: E");
        } else {
            System.out.println("grade: F");
        }

        sc.close();

    }
}
