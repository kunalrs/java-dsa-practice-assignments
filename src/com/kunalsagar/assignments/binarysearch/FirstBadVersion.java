package com.kunalsagar.assignments.binarysearch;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FirstBadVersion {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    public static int firstBadVersion(int n) {
        var start = 1;
        var end = n;
        while(start <= end) {
            var mid = start + (end - start) / 2;
            if (isBadVersion(mid))
                end = mid - 1;
            else
                start = mid + 1;

        }
        return start;
    }

    public static boolean isBadVersion(int n) {
        return n >= 4;
    }
}
