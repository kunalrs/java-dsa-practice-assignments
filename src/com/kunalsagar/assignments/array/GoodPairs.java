package com.kunalsagar.assignments.array;
/**
 * Challenge Source: LeetCode
 * URL: https://leetcode.com/problems/number-of-good-pairs/
 * */
public class GoodPairs {
    public static void main(String[] args) {
        var nums = new int[]{1,2,3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        var goodPairs = 0;
        for(var i = 0; i < nums.length; i++) {
            for (var j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j] && i < j) {
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }
}
