package com.kunalsagar.assignments.arrays;
/**
 * LeetCode https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
 * */
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        var newArr = new int[arr.length * 2];
        for(var i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        for(var i = arr.length; i >= 0; i--) {
            // identify 0s
            if(newArr[i] == 0) {
                moveElements(newArr, i);
            }
        }

        for(var i = 0; i < arr.length; i++) {
            arr[i] = newArr[i];
        }
    }

    void moveElements(int[] arr, int index) {
        for(var i = arr.length - 2; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
    }
}
