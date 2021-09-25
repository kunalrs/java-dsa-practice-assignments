package com.kunalsagar.assignments.array;

import java.util.Arrays;

/**
 * Challenge Source: LeetCode
 * URL: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * */
public class SmallerThanCurrentNo {

    public static void main(String[] args) {
        var nums = new int[]{6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        var smaller = new int[nums.length];
        for(var i = 0; i < nums.length; i++) {
            var count = 0;
            for(var j = 0; j < nums.length; j++) {
                if(j != i && nums[j] < nums[i]) {
                    count++;
                }
            }
            smaller[i] = count;
        }
        return smaller;
    }

}
