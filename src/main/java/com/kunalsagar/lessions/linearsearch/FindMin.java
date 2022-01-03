package com.kunalsagar.lessions.linearsearch;

public class FindMin {
    public static void main(String[] args) {
        var arr = new int[]{181, 3201, 510, 23, 22, 67, 80 , 11, 35, 321, 1919, 876, 24, 0};
        System.out.println(min(arr));
    }

    private static int min(int[] arr) {
        var min = Integer.MAX_VALUE;
        for(var i = 0; i < arr.length; i++)
            if(arr[i] < min)
                min = arr[i];

        return min;
    }
}
