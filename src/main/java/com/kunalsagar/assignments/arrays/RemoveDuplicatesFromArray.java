package com.kunalsagar.assignments.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;

        var i = 0;
        var j = 1;

        while(j < nums.length) {
            if(nums[j] <= nums[i])
                j++;
            else {
                nums[++i] = nums[j];
            }
        }

        return i + 1;
    }
}
