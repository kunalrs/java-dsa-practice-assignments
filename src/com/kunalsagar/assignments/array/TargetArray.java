package com.kunalsagar.assignments.array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Challenge source: LeetCode
 * URL: https://leetcode.com/problems/create-target-array-in-the-given-order/
 * */
public class TargetArray {

    public static void main(String[] args) {
        var nums = new int[]{0,1,2,3,4};
        var index = new int[]{0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        var target = new ArrayList<Integer>(nums.length);
        for(int i = 0; i < nums.length; i++) {
            target.add(index[i], nums[i]);
        }
        return target.stream().mapToInt(i -> i).toArray();
    }
}
