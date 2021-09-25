package com.kunalsagar.lessions.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        if(arr.length < 1)
            return;

        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            SwapElements.swap(arr, start, end);
            start++;
            end--;
        }
    }
}
