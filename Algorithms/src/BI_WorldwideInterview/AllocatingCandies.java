package BI_WorldwideInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllocatingCandies {
    public static int minimumCandies(int[] input) {
        int minCandies = 0;
        int outputArr[] = new int[input.length];
        List<Integer> output = new ArrayList<Integer>();
        //int[] sortedInput = Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            if(i+1<input.length) {
                if (input[i] < input[i + 1]) {
                    outputArr[i] = 1;
                } else if (input[i] > input[i + 1]) {
                    outputArr[i] = 2;
                } else {
                    outputArr[i] = 1;
                }
            }else{
                System.out.println("no right element to compare");
            }
            if(i-1>=0) {
                System.out.println();
                if (input[i] < input[i - 1]) {
                    outputArr[i] = 1;
                } else if (input[i] > input[i - 1]) {
                    outputArr[i] = 2;
                } else {
                    outputArr[i] = 1;
                }
            }else{
                System.out.println("no left element to compare");
            }
        }

        for (int i = 0; i < outputArr.length; i++) {
            minCandies += outputArr[i];
        }
        return minCandies;
    }

    public static void main(String[] args) {
        int[] input = {1,0,2};
        System.out.println(minimumCandies(input));
    }
}
