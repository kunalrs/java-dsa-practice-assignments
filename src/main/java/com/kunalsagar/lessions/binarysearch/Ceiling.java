package com.kunalsagar.lessions.binarysearch;

public class Ceiling {

    public static void main(String[] args) {
        var arr = new int[] {1, 2, 5};
        System.out.println(ceiling(arr, 3));
    }

    // return index of the greatest no. <= target
    static int ceiling(int[] nums, int target) {

        if(target < nums[0])
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

        return start;
    }
}
