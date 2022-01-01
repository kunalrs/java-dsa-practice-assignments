package com.kunalsagar.assignments.twopointers;

import java.util.Arrays;

/**
 * LeetCode https://leetcode.com/problems/squares-of-a-sorted-array/
 * */
public class SquaresSortedArray {
    public static void main(String[] args) {
        var nums = new int[] {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(x -> x * x).sorted().toArray();
    }

}
