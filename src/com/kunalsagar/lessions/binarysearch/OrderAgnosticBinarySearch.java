package com.kunalsagar.lessions.binarysearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        var arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(search(arr, 9));
    }

    static int search(int[] arr, int target) {
        var start = 0;
        var end = arr.length - 1;
        var isAsc = arr[start] < arr[end];

        while(start <= end) {
            var mid = start + (end - start) / 2;
            if(arr[mid] == target)
                return mid;

            if(isAsc) {
                if (target < arr[mid])
                    end = mid - 1;
                else if (target > arr[mid])
                    start = mid + 1;
            } else {
                if (target > arr[mid])
                    end = mid - 1;
                else if (target < arr[mid])
                    start = mid + 1;
            }
        }

        return -1;
    }
}
