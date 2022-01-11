package com.kunalsagar.assignments.arrays;
/**
 * LeetCode https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
 * */
public class CheckNAndDouble {
    public boolean checkIfExist(int[] arr) {

        for(var i = 0; i < arr.length; i++) {
            for(var j = 0; j < arr.length; j++) {
                if(i != j && arr[i] == arr[j] * 2)
                    return true;
            }
        }
        return false;
    }
}
