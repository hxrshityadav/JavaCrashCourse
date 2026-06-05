package ControlFlowAndMethods;
import java.util.Scanner;
public class DoWhileLoop {

    public static void main(String[] args){

        int num;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Guess (1-10): ");
            num = sc.nextInt();
        } while (num !=7);

        System.out.println("Correct!");

    }

}
