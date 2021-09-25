package com.kunalsagar.assignments.array;
/**
 * Challenge source: LeetCode
 * URL: https://leetcode.com/problems/find-the-highest-altitude/
 * */
public class HighestAltitude {

    public static void main(String[] args) {
        var gain = new int[]{-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        var highestAltitude = 0;
        var runningTotal = 0;
        for(int g: gain) {
            runningTotal += g;
            if(runningTotal > highestAltitude)
                highestAltitude = runningTotal;

        }
        return highestAltitude;
    }
}
