package com.kunalsagar.lessions.binarysearch;

public class Floor {

    public static void main(String[] args) {
        var arr = new int[] {2, 3, 5, 9, 14, 16, 18};
        System.out.println(floor(arr, 10));
    }

    // return index of smallest no. >= target
    static int floor(int[] nums, int target) {

        // if target is > than last element of array
        if(target > nums[nums.length - 1])
            return -1;

        var start = 0;
        var end = nums.length - 1;
        var isAsc = nums[start] < nums[end];

        while(start <= end) {
            var mid = start + (end - start) / 2;
            if(nums[mid] == target)
                return mid;

            if(isAsc) {
                if (target < nums[mid])
                    end = mid - 1;
                else if (target > nums[mid])
                    start = mid + 1;
            } else {
                if (target > nums[mid])
                    end = mid - 1;
                else if (target < nums[mid])
                    start = mid + 1;
            }
        }

        return end;
    }
}
