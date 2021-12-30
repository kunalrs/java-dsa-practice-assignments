package com.kunalsagar.assignments.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        var nums = new int[] {-1,0,3,5,9,12};
        var target = 2;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
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
        return -1;
    }
}
