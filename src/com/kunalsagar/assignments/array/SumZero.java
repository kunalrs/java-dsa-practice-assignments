package com.kunalsagar.assignments.array;

import java.util.Arrays;
/**
 * Challenge source: LeetCode
 * URL: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 * */
public class SumZero {

    public static void main(String[] args) {

        int n = 8;
        System.out.println(Arrays.toString(sumZero(n)));
    }

    public static int[] sumZero(int n) {
        var arr = new int[n];
        var i = 0;
        var j = 1;

        if(n % 2 != 0) {
            arr[0] = 0;
            n--;
            i++;
            for (var k = i; k <= n; k++) {
                arr[k] = j - n;
                j += 2;
            }
        } else {
            for (var k = i; k < n; k++) {
                arr[k] = j - n;
                j += 2;
            }
        }
        return arr;
    }
}
