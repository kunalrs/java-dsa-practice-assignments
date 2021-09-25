package com.kunalsagar.assignments.array;

import java.util.Arrays;

/**
 * Challenge source: LeetCode
 * URL: https://leetcode.com/problems/concatenation-of-array/
 * */
public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < ans.length; i++) {
            if(i <= (nums.length-1))
                ans[i] = nums[i];
            else
                ans[i] = nums[i - nums.length];
        }
        return ans;
    }
}
