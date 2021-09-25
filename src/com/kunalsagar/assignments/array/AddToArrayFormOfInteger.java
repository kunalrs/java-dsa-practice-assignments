package com.kunalsagar.assignments.array;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Challenge Source: LeetCode
 * URL: https://leetcode.com/problems/add-to-array-form-of-integer/
 * */
public class AddToArrayFormOfInteger {

    public static void main(String[] args) {
        var num = new int[] {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        var k = 516;

        System.out.println(addToArrayForm(num, k));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        var output = new ArrayList<Integer>();
        var strNum = "";
        for(int n: num)
            strNum += String.valueOf(n);

        var number = new BigInteger(strNum).add(BigInteger.valueOf(k));
        System.out.println(number);
        for(char ch : String.valueOf(number).trim().toCharArray())
            output.add(Integer.valueOf(String.valueOf(ch)));

        return output;
    }
}
