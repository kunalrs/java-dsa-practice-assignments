package com.kunalsagar.assignments.array;

import java.util.Arrays;

/**
 * Challenge source: LeetCode
 * URL: https://leetcode.com/problems/shuffle-the-array/
 *
 * */
public class ShuffleArray {

    public static void main(String[] args) {
        var nums = new int[]{2,5,1,3,4,7};
        var n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        var result = new int[nums.length];
        int index = 0;
        for(int i = 0 ; i < n; i++) {
            result[index] = nums[i];
            index++;
            result[index] =  nums[n + i];
            index++;
        }
        return result;
    }
}
