package OOP;

public class StudentCons {

    String name;
    int age;
    String course;

    StudentCons(String name, int age, String course){
        this.name=name;
        this.age=age;
        this.course=course;
    }

    public void introduce(){
        System.out.println(
                "Hi, I am " + name +
                        ", Age: " + age +
                        ", Course: " + course
        );
    }

    public void study() {
        System.out.println(name + " is studying " + course);
    }

    public static void main(String[] args){
    StudentCons s1 = new StudentCons("Harshit",21,"CSE");
    StudentCons s2 = new StudentCons("Rahul",20,"IT");

    s1.introduce();
    s1.study();

    System.out.println();

    s2.introduce();
    s2.study();
    }

}
