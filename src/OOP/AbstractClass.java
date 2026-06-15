package OOP;

public class AbstractClass {

    // Abstract Parent Class
    static abstract class Animal {

        public abstract void makeSound();
    }

    // Child Class
    static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

    // Child Class
    static class Cat extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Meow!");
        }
    }

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}