package Collections;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args){

        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Delhi");

        System.out.println(cities);
        cities.remove("Delhi");
        System.out.println(cities.contains("Delhi"));
        System.out.println(cities.size());
        System.out.println(cities.isEmpty());

        for(String city : cities){
            System.out.println(city);
        }
    }

}
