package com.kunalsagar.lessions.array;

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Two-Pointer Swap Method
     * */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
