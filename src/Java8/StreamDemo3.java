package Java8;
import java.util.*;

public class StreamDemo3 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original List: ");
        System.out.println(numbers);

        System.out.println("\nAscending Order: ");

        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nDescending Order");

        numbers.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
