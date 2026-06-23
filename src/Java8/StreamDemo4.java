package Java8;
import java.util.*;

public class StreamDemo4 {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        //Sum of all numbers
        int sum = numbers.stream()
                .reduce(0, (a,b) -> a+b);

        //Maximum number
        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a,b)-> Math.max(a,b));

        //Minimum number
        int min = numbers.stream()
                .reduce(Integer.MAX_VALUE, (a,b) -> Math.min(a,b));

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);




    }
}
