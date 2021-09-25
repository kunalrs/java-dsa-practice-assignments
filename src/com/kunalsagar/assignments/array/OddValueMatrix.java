package com.kunalsagar.assignments.array;
/**
 * Challenge Source: LeetCode
 * URL: https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 * */
public class OddValueMatrix {

    public static void main(String[] args) {
        var indices = new int[][] {
                {1, 1},
                {0, 0}
        };
        System.out.println(oddCells(2, 2, indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        var oddCount = 0;
        var matrix = new int[m][n];
        for(var i = 0; i < indices.length; i++) {
            var row = indices[i][0];
            var col = indices[i][1];

            for(var j = 0; j < matrix[row].length; j++)
                matrix[row][j] += 1;

            for (var j = 0; j < matrix.length; j++)
                matrix[j][col] += 1;

        }
        for(var i = 0; i < matrix.length; i++)
            //System.out.println(Arrays.toString(matrix[i]));
            for(var j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] % 2 != 0)
                    oddCount++;

        return oddCount;
    }
}
