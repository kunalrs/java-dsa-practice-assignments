package com.kunalsagar.assignments.arrays;

import java.util.Arrays;
/**
 * Leet Code https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * */
public class TwoSumII {

    public static void main(String[] args) {
        var numbers = new int[] {2,7,11,15};
        var target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        var a = 0;
        var b = 0;
        for(var i = 0; i < numbers.length; i++) {
            for (var j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    a = i;
                    b = j;
                }
            }
        }
        return new int[] {a + 1, b + 1};
    }
}
