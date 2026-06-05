package ControlFlowAndMethods;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args){

        int n = 1;
        while (n <= 5) {
            System.out.println(n + " "); // 1 2 3 4 5
            n++;
        }

        // Real use case: keep asking until valid input
        Scanner sc = new Scanner(System.in);
        int input = -1;
        while(input < 0){
            System.out.print("Enter a positive Number: ");
            input = sc.nextInt();
        }
        System.out.println("You entered: " + input);

    }

}
