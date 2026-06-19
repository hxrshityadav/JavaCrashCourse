package Java8;
import java.util.*;
import java.util.stream.*;

public class StreamDemo2 {

    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        List<Integer> result = numbers.stream()
                .filter(num -> num > 20)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
