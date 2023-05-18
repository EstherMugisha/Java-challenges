package Integers;

import java.sql.Array;
import java.util.ArrayList;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
*/
public class TwoSum {
    public static int[] twoSum(int[] input, int target) {
        int result[] = new int[2];
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        int[] result = twoSum(input, 9);
        for (int i=0; i<result.length;i++){
            System.out.print(result[i]);
        }
    }
}
