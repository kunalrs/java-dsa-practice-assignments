package com.kunalsagar.lessions.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        var arr = new int[] {1, 2, 3, 45, 19, 0, 18};
        var target = 19;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        for(var index = 0; index < arr.length; index++) {
            if (arr[index] == target)
                return index;
        }

        return -1; // item not found
    }
}
