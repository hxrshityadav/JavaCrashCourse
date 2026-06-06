package Projects;

import java.util.*;

public class FactorialCalculator {

    static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("\n===== Factorial Calculator =====");
            System.out.println("1. Calculate Factorial");
            System.out.println("2. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter a number: ");
                    int number = sc.nextInt();

                    if(number < 0){
                        System.out.println("Factorial cannot be calculated for negative number");
                        break;
                    }

                    int result = factorial(number);
                    System.out.println(number + "! = " + result);
                    break;

                case 2:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }

}
