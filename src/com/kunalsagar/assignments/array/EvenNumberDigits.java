package com.kunalsagar.assignments.array;
/**
 * Challenge Source: LeetCode
 * URL: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * */
public class EvenNumberDigits {
    public static void main(String[] args) {
        var nums = new int[] {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        var count = 0;
        for(int i = 0; i < nums.length; i++) {
            var num = nums[i];
            var digit = 0;
            while(num > 0) {
                num = num / 10;
                digit++;
            }

            if(digit % 2 == 0)
                count++;
        }
        return count;
    }
}
