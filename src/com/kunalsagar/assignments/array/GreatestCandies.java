package com.kunalsagar.assignments.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Challenge Source: LeetCode
 * URL: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * */
public class GreatestCandies {
    public static void main(String[] args) {
        var candies = new int[]{4,2,1,1,2};
        var extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        var result = new ArrayList<Boolean>(candies.length);
        for(int i = 0; i < candies.length; i++) {
            var additionalCandies = candies[i] + extraCandies;
            var greatest = additionalCandies;
            for(int j = 0; j < candies.length; j++) {
                if(greatest < candies[j]) {
                    greatest = candies[j];
                }
            }
            result.add(i,!(greatest > additionalCandies));
        }
        return result;
    }
}
