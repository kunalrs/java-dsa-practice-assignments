package com.kunalsagar.assignments.twopointers;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        var nums = new int[] {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        var lastZero = 0;
        for (var i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[lastZero++] = nums[i];
            }
        }

        for(var i = lastZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
