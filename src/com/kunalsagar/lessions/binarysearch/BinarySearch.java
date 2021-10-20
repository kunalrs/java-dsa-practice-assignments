package com.kunalsagar.lessions.binarysearch;

import java.util.stream.IntStream;

public class BinarySearch {

    public static void main(String[] args) {
        var arr = IntStream.rangeClosed(1, 10000).toArray();
        System.out.println(search(arr, 500001));
    }

    static int search(int[] arr, int target) {
        var start = 0;
        var end = arr.length - 1;
        while(start <= end) {
            var mid = start + (end - start) / 2;
            System.out.println("Searching... " + start + " , " + mid + ", " + end);
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}