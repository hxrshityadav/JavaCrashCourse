package ControlFlowAndMethods;

public class ForLoop {
    public static void main(String[] args){

        //Basic for loop
        System.out.println("Basic For Loop:");

        for(int i = 0; i < 5; i++){
            System.out.print(i + " "); // 0 1 2 3 4
        }

        System.out.println("\n"); //move to the next line

        // Count down
        System.out.println("Countdown:");

        for (int i = 10; i>=0; i -=2){
            System.out.print(i+" ");
        }

        System.out.println("\n");

        //Nested loops - multiplication table
        System.out.println("Multiplication Table:");

        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 3; j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }


    }
}
