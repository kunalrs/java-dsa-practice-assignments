package com.kunalsagar.lessions.linearsearch;

public class SearchIn2DArray {
    public static void main(String[] args) {
        var arr = new int[][] {
                {24, 1, 4},
                {18, 12, 4, 9},
                {78, 19, 18, 99},
                {22, 100}
        };
        var target = 1919;
        System.out.println(search(arr, target));
    }

    private static boolean search(int[][] arr, int target) {
        for(var row = 0; row < arr.length; row++)
            for (var col = 0; col < arr[row].length; col++)
                if(target == arr[row][col])
                    return true;

        return false;
    }
}
