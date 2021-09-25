package com.kunalsagar.assignments.array;

import java.util.Arrays;

/**
 * Source: LeetCode Quiz
 * Url: https://leetcode.com/problems/build-array-from-permutation/
 * */
public class ArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(arr));
        var output = buildArray(arr);
        System.out.println(Arrays.toString(output));
    }

    public static int[] buildArray(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i = 0 ; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }

        return ans;
    }
}
