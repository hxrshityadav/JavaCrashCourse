package Arrays;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args){

        int[] scores = {95, 67, 87, 98, 91};

        System.out.println(scores[0]);
        System.out.println(scores[4]);

        scores[2] = 78;

        int sum = 0;

        for(int s : scores){
            sum += s;
        }

        double avg = (double) sum / scores.length;

        System.out.println("Average: " + avg);

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(matrix[1][2]);

    }
}
