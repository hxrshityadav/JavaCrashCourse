package OOP;

public class Polymorphism {
    public void makeSound(){
        System.out.println("Animal Sound");
    }

    static class Dog extends Polymorphism{

         @Override
         public void makeSound(){
             System.out.println("Woof!");
         }
    }

    static class Cat extends Polymorphism{

        @Override
        public void makeSound(){
            System.out.println("Meow!");
        }
    }

    public static void main(String[] args){
        Polymorphism a1 = new Dog();
        Polymorphism a2 = new Cat();

        a1.makeSound();
        a2.makeSound();
    }
}

