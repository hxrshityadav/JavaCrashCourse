package Projects;

import java.util.*;

public class SafeCalculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n===== Safe Calculator =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:

                    System.out.print("Enter First Number: ");
                    int num1 = sc.nextInt();

                    System.out.print("Enter Second Number: ");
                    int num2 = sc.nextInt();

                    int sum = num1 + num2;

                    System.out.println("Result = " + sum);

                    break;

                case 2:

                    System.out.print("Enter First Number: ");
                    int subNum1 = sc.nextInt();

                    System.out.print("Enter Second Number: ");
                    int subNum2 = sc.nextInt();

                    int difference = subNum1 - subNum2;

                    System.out.println("Result = " + difference);

                    break;

                case 3:

                    System.out.print("Enter First Number: ");
                    int mulNum1 = sc.nextInt();

                    System.out.print("Enter Second Number: ");
                    int mulNum2 = sc.nextInt();

                    int product = mulNum1 * mulNum2;

                    System.out.println("Result = " + product);

                    break;

                case 4:

                    try {

                        System.out.print("Enter Dividend: ");
                        int dividend = sc.nextInt();

                        System.out.print("Enter Divisor: ");
                        int divisor = sc.nextInt();

                        int result = dividend / divisor;

                        System.out.println("Result = " + result);

                    } catch(Exception e) {

                        System.out.println(
                                "Error: " + e.getMessage()
                        );

                    }

                    break;

                case 5:

                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice");

            }
        }
    }

}
