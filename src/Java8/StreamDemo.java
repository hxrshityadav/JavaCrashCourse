package Java8;

import java.util.*;

public class StreamDemo {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.stream()
                .filter(num -> num > 25)
                .forEach(System.out::println);

        numbers.stream()
                .filter(num -> num%2 ==0)
                .forEach(System.out::println);

        numbers.stream()
                .filter(num -> num > 20)
                .map(num -> num * 2)
                .forEach(System.out::println);
    }
}
