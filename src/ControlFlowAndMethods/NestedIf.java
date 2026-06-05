package ControlFlowAndMethods;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you have Ticket(true/false): ");
        boolean hasTicket = sc.nextBoolean();

        if(hasTicket){

            System.out.println("What's your age: ");
            int age = sc.nextInt();

            if(age >= 18){
                System.out.println("Welcome in!");
            } else {
                System.out.println("too young");
            }
        } else {
            System.out.println("No Ticket, No Entry.");
        }

        sc.close();

    }




}
