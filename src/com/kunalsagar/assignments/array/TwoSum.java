package com.kunalsagar.assignments.array;

import java.util.Arrays;

/**
 * Challenge source: LeetCode
 * URL: https://leetcode.com/problems/two-sum/
 * */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 220;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }


    public static int[] twoSum(int[] nums, int target) {
        int a = -1, b = -1;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i == j)
                    break;
                if(nums[i] + nums[j] == target) {
                    a = i;
                    b = j;
                }
            }
        }
        return new int[]{a, b};
    }
}
