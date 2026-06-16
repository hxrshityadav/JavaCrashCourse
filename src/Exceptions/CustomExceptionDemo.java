package Exceptions;

import java.util.*;

public class CustomExceptionDemo {

    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message){
            super(message);
        }
    }

    static void checkAge(int age) throws InvalidAgeException {

        if(age < 0){
            throw new InvalidAgeException("Age cannot be negative");
        }
        System.out.println("Valid Age");
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter your Age: ");
            int age = sc.nextInt();

            checkAge(age);

        } catch (InvalidAgeException e){

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }

        sc.close();
    }
}
