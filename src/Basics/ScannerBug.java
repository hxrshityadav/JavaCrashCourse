package Basics;

import java.util.Scanner;

public class ScannerBug {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = sc.nextInt(); // nextInt() leaves '\n' in the buffer

        sc.nextLine(); //consume leftover newline

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Age: " + age);
        System.out.println("Name: " + name);

        sc.close();
    }
}
