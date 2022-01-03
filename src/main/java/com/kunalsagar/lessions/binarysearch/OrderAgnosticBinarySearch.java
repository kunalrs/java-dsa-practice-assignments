package com.kunalsagar.lessions.binarysearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        var arr = new int[] {1,3,5,6};
        System.out.println(search(arr, 9));
    }

    static int search(int[] nums, int target) {
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

        return -1;
    }
}
