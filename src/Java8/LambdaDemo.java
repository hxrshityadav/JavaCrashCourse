package Java8;

import java.util.*;

interface Calculator {
    int add(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();
        Calculator calc = (x, y) -> x + y;

        System.out.println(calc.add(a,b));
    }

}
