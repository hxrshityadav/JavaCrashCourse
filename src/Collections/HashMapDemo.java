package Collections;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args){

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Harshit");
        students.put(102, "Prince");
        students.put(103, "Golu");
        students.put(104, "Utsav");
        students.put(105, "Prakhar");

        System.out.println(students);
        System.out.println(students.get(101));
        System.out.println(students.containsKey(102));
        students.remove(103);
        System.out.println(students.size());

        for(Integer rollNo : students.keySet()){

            System.out.println(
                    rollNo + " -> " + students.get(rollNo)
            );
        }

    }
}
