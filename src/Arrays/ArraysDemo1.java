package Arrays;

import java.util.Arrays;

public class ArraysDemo1 {

    public static void main(String[] args){

        int[] nums = {5, 2, 8, 1, 9};

        System.out.println("original: " + Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println("Sorted: " + Arrays.toString(nums));

        int[] copy = Arrays.copyOf(nums, nums.length);

        copy[0] = 100;

        System.out.println("Original: " + Arrays.toString(nums));

        System.out.println("Copy: " + Arrays.toString(copy));

    }

}
