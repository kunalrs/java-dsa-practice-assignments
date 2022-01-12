package com.kunalsagar.assignments.twopointers;
/**
 * LeetCode https://leetcode.com/problems/squares-of-a-sorted-array
 * */
public class SortingSquaredArray {
    public int[] sortedSquares(int[] nums) {
        var left = 0;
        var right = nums.length - 1;
        var results = new int[nums.length];

        for(var i = nums.length - 1; i >= 0; i--) {
            var square = 0;
            if(Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;
            }
            results[i] = square * square;
        }

        return results;
    }
}
