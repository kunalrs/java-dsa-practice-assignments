package com.kunalsagar.assignments.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        var i = 0;
        for(var j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
