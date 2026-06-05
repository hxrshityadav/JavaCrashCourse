package ControlFlowAndMethods;

public class BreakAndContinue {

    public static void main(String[] args){

        // break — exits the loop entirely
        for(int i = 0; i < 10; i++){
            if(i ==5) break;
            System.out.print(i+" "); // 0 1 2 3 4
        }

        // continue - skips current iteration, keeps going
        for (int i = 0; i < 10; i++){
            if(i%2 ==0) continue; // skip even numbers
            System.out.print(i+" "); // 1 3 5 7 9
        }

        // Labeled break — exit an outer loop from inside a nested one
        outer:
        for(int i=0; i<3; i++){
            for(int j = 0; j < 3; j++){
                if ( j== 1) break outer;
                System.out.print(i+""+j+" ");
            }
        }

    }

}
