package com.kunalsagar.assignments.arrays;

import java.util.Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        var nums = new int[] {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int num = 0, max = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                num++;
                if(num > max) {
                    max = num;
                }
            } else {
                if(num > max) {
                    max = num;
                }
                num = 0;
            }
        }
        return max;
    }
}
