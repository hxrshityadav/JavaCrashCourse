package Java8;

@FunctionalInterface
interface Calculator1 {

    int add(int a, int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args){

        Calculator1 calc = (a, b) -> a + b;

        System.out.println(calc.add(10,20));
    }
}