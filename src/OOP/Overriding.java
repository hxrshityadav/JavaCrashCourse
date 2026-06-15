package OOP;

public class Overriding {

    public void makeSound(){
        System.out.println("Animal Sound");
    }

    static class Dog extends Overriding {

        @Override
        public void makeSound(){
            System.out.println("Woof!");
        }
    }

    static class Cat extends Overriding{

        @Override
        public void makeSound(){
            System.out.println("Meow");
        }
    }

    public static void main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();

    }

}
