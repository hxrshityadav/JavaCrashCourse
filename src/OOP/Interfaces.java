package OOP;

public class Interfaces {
    interface Flyable{
        void fly();
    }

    static class Bird implements Flyable{

        @Override
        public void fly(){
            System.out.println("Bird is flying");
        }
    }

    static class Airplane implements Flyable {

        @Override
        public void fly(){
            System.out.println("Airplane is flying");
        }
    }

    public static void main(String[] args){
        Flyable bird = new Bird();
        Flyable airplane = new Airplane();

        bird.fly();
        airplane.fly();
    }
}
