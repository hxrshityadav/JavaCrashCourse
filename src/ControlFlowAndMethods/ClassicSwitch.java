package ControlFlowAndMethods;

import java.util.Scanner;

public class ClassicSwitch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the day: ");
        int day = sc.nextInt();

        switch (day) { // ⚠️ Always add break — without it, Java falls through and runs the next case too.
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: case 7: System.out.println("Weekend"); break;
            default: System.out.println("Invalid Day");
        }

    }
}
