package Recursion;

public class RecursionDemo {

    public static int fac(int n){

        if(n == 0)
            return 1;

        return n*fac(n-1);
    }

    public static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args){

        System.out.println("Factorial of 5 = " + fac(5));
        System.out.println("Fibonacci of 7 = " + fib(7));

    }

}
