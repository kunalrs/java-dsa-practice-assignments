package com.kunalsagar.assignments.twopointers;

import java.util.Arrays;

/**
 * LeetCode https://leetcode.com/problems/rotate-array/
 * */
public class RotateArray {

    public static void main(String[] args) {
        var nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        var k = 4;
        System.out.println(Arrays.toString(nums));
        rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        // If array length is 1, its k rotation is always same hence good optimization.
        if (nums.length == 1)
            return;

        k %= nums.length;
        rotate_arr(nums, 0, nums.length - 1);
        rotate_arr(nums, 0, k - 1);
        rotate_arr(nums, k, nums.length - 1);

    }

    static void rotate_arr(int[] nums, int start, int end) {
        while(start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
