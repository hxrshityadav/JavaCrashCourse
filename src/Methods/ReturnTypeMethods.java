package Methods;

public class ReturnTypeMethods {

    public static int add(int a, int b){
        return a + b;
    }

    public static boolean isEven(int n){
        return n%2 ==0;
    }

    public static double circleArea(double radius){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args){

        int sum = add(3, 4);
        double area = circleArea(5.0);
        boolean even = isEven(8);

        System.out.println("Sum = " + sum);
        System.out.println("Area = " + area);
        System.out.println("Is Even = " + even);

    }

}
