package com.kunalsagar.assignments.twopointers;

import java.util.Arrays;

/**
 * LeetCode https://leetcode.com/problems/reverse-string/
 * */
public class ReverseString {
    public static void main(String[] args) {
        var s = new char[] {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        var start = 0;
        var end = s.length - 1;
        while (start < end) {
            var temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
