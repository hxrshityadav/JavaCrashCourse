package Exceptions;

import java.util.*;

public class TryCatchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter Dividend: ");
            double dividend = sc.nextDouble();
            System.out.println("Enter Divisor: ");
            double divisor = sc.nextDouble();
            double result  = (dividend)/(divisor);
            System.out.println(result);

        } catch(Exception e) {

            System.out.println("Cannot be divided");
            System.out.println("Error: " + e.getMessage());

        }

    }
}
