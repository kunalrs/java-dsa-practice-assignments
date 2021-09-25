package com.kunalsagar.assignments;
/**
 * Challenge source: LeetCode
 * Url: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * */
public class SubtractProductSum {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem;
            product *= rem;
        }
        return product - sum;
    }
}
