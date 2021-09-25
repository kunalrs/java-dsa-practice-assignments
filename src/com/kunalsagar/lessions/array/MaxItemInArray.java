package com.kunalsagar.lessions.array;

public class MaxItemInArray {
    public static void main(String[] args) {
        int[] arr = {1, 28909, 3, 400, 5, 6,7 ,8 ,9, 10};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }
}
