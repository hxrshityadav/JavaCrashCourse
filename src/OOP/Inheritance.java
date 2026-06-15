package OOP;

public class Inheritance {

    String name;

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    static class Dog extends Inheritance {
        public void bark(){
            System.out.println(name + " says Woof!");
        }
    }

    static class Cat extends Inheritance {
        public void meow(){
            System.out.println(name + " says Meow");
        }
    }

    public static void main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.name = "Tommy";
        cat.name = "Kitty";

        dog.eat();
        dog.sleep();
        dog.bark();

        cat.eat();
        cat.sleep();
        cat.meow();
    }
}


