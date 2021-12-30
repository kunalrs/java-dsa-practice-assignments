package com.kunalsagar.assignments.binarysearch;
/**
 * LeetCode https://leetcode.com/problems/search-insert-position/
 * */

public class SearchIndexPosition {
    public static void main(String[] args) {
        var nums = new int[]{1,3,5,6};
        var target = 2;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        var start = 0;
        var end = nums.length - 1;
        while(start <= end) {
            var mid = start + (end - start) / 2;
            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else
                return mid;
        }
        return start;
    }
}
