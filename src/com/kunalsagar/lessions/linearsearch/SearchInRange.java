package com.kunalsagar.lessions.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        var arr = new int[]{1, 3, 510, 23, 22, 67, 0 , 11, 35, 321, 1919, 876, 24};
        var target = 67;
        var start = 0;
        var end = 8;
        System.out.println(search(arr, target, start, end));
    }

    static int search(int[] arr, int target, int start, int end) {
        for(var i = start; i < end + 1; i++) {
            if(arr[i] == target)
                return i;
        }

        return -1;
    }
}
