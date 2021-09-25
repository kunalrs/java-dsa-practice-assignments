package com.kunalsagar.assignments.array;

import java.util.HashMap;

/**
 * Challenge source: LeetCode
 * URL: https://leetcode.com/problems/maximum-population-year/
 * */
public class MaximumPopulationYear {

    public static void main(String[] args) {
        var logs = new int[][] {
                {2033,2034},
                {2039,2047},
                {1998,2042},
                {1998,2042},
                {2047,2048},
                {2025,2029},
                {2005,2044},
                {1990,1992},
                {1952,1956},
                {1984,2014}
        };

        /*var logs = new int[][] {
                {1950,1961},
                {1960,1971},
                {1970,1981}
        };*/

        System.out.println(maximumPopulation(logs));
    }

    public static int maximumPopulation(int[][] logs) {
        var maxCount = 0;

        var years = new HashMap<Integer, Integer>();

        for(var year = 1950; year <= 2050; year++) {
            var count = 0;
            for(int i = 0; i < logs.length; i++) {
                if(logs[i][0] <= year && logs[i][1] > year) {
                    count++;
                }
            }

            if(count > maxCount) {
                maxCount = count;
                years.put(year, count);
            }
        }

        maxCount = 0;
        var earlierYear = 9999;
        for(Integer year: years.keySet()) {
            //System.out.println(year + " : " + years.get(year));
            if(years.get(year) >= maxCount) {
                earlierYear = year;
                maxCount = years.get(year);
            }
        }

        return earlierYear;
    }
}
