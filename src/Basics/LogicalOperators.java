package Basics;

public class LogicalOperators {
    public static void main(String[] args) {
        int age = 25;
        int age1 = 70;
        boolean isLoggedIn = true;

        System.out.println(age >= 18 && age <= 60);
        System.out.println(age1 >= 18 || age1 <= 60);
        System.out.println(!isLoggedIn);


    }
}