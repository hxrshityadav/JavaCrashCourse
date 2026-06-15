package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();

        names.add("Harshit");
        names.add("Rahul");
        names.add("Prince");

        System.out.println(names);

        System.out.println(names.get(1));

        System.out.println(names.size());

        names.remove("Rahul");
        System.out.println(names);

        names.set(1, "Golu");
        System.out.println(names);

        System.out.println(names.contains("Harshit"));

        for(String name : names){
            System.out.println(name);
        }

    }
}
