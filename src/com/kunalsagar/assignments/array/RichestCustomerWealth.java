package com.kunalsagar.assignments.array;
/**
 * Challenge source: LeetCode
 * URL: https://leetcode.com/problems/richest-customer-wealth/
 * */
public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int richest = 0;
        for(int row = 0; row < accounts.length; row++) {
            int rowTotal = 0;
            for(int bankBal: accounts[row])
                rowTotal+= bankBal;
            if(rowTotal > richest)
                richest = rowTotal;
        }
        return richest;
    }
}
