package com.kunalsagar.assignments.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * LeetCode URL: https://leetcode.com/problems/two-sum/
 * */
public class TwoSum {
    public static void main(String[] args) {
        var nums = new int[]{3,3};
        var target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        var a = 0;
        var b = 0;
        for(var i = 0; i < nums.length; i++) {
            for (var j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    a = i;
                    b = j;
                }
            }
        }
        return new int[] {a, b};
    }
}
