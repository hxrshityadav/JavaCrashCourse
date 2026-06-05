package ControlFlowAndMethods;
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        String status =(age >= 18) ? "Adult" : "Minor";
        System.out.println(status);

        sc.close();
    }
}
