package Methods;

public class MethodOverloading {

    public static int multiply(int a, int b){
        return a * b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static int multiply(int a, int b, int c){
        return a * b * c;
    }

    public static void main(String[] args){

        int result1 = multiply(3, 4);
        double result2 = multiply(2.5, 4.0);
        int result3 = multiply(2, 3, 4);

        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
        System.out.println("Result 3 = " + result3);

    }
}