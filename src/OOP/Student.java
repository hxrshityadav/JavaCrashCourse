package OOP;

public class Student {

    String name;
    int age;
    String course;

    public void introduce(){
        System.out.println(
                "Hi, I am " + name +
                ", Age: " + age +
                ", Course: " + course
        );

    }

    public void study(){
        System.out.println(name + " is studying " + course);
    }

    public static void main(String[] args){

        Student s1 = new Student();

        s1.name = "Harshit";
        s1.age= 21;
        s1.course = "CSE";

        s1.introduce();
        s1.study();

        System.out.println();

        Student s2 = new Student();

        s2.name = "Rahul";
        s2.age = 20;
        s2.course = "IT";

        s2.introduce();
        s2.study();
    }
}
