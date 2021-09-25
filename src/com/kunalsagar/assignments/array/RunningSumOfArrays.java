package com.kunalsagar.assignments.array;

import java.util.Arrays;

public class RunningSumOfArrays {

    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            sums[i] = nums[i] + sums[i - 1];
        }
        return sums;
    }
}
