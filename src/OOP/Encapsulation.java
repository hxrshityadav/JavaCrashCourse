package OOP;

public class Encapsulation {

    private String name;
    private int age;
    private String course;

    public Encapsulation(String name, int age, String course){
        this.name = name;
        this.age= age;
        this.course = course;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getCourse(){
        return course;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){

        if(age>0){
            this.age=age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    public void setCourse(String course){
        this.course = course;
    }

    public void introduce(){

        System.out.println(
            "Hi, I am "+ name +
            ", Age: " + 21 +
            ", Course: " + course
        );
    }

    public static void main(String[] args){

        Encapsulation s1 = new Encapsulation("Harshit", 21, "CSE");

        s1.introduce();

        System.out.println("\nUsing getters:");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Course: " + s1.getCourse());

        System.out.println("\nUpdating Age: ");
        s1.setAge(25);
        System.out.println("Updated Age: " + s1.getAge());

        System.out.println("\nTrying Invalid Age:");
        s1.setAge(-10);

        System.out.println("\nUpdating Course:");
        s1.setCourse("Computer Science");
        System.out.println("Updated Course: " + s1.getCourse());

        System.out.println("\nUsing getters:");
        s1.introduce();
    }

}