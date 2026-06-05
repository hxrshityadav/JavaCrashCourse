package ControlFlowAndMethods;

import java.util.Scanner;

public class NewSwitch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your day: ");
        String day = sc.nextLine();

        String type = switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Unknown";
        };

        System.out.println(type);

        sc.close();

    }
}
