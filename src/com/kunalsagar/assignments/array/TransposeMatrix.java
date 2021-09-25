package com.kunalsagar.assignments.array;

import java.util.Arrays;

/**
 * Challenge source: LeetCode
 * URL: https://leetcode.com/problems/transpose-matrix/
 * */
public class TransposeMatrix {
    public static void main(String[] args) {
        var matrix = new int[][]{
                {1,2,3},
                {4,5,6}
        };
        for(int[] row: matrix)
            System.out.println(Arrays.toString(row));

        System.out.println("-----------------------");

        var transpose = transpose(matrix);
        for(int[] row: transpose)
            System.out.println(Arrays.toString(row));
    }

    public static int[][] transpose(int[][] matrix) {
        var transpose = new int[matrix[0].length][matrix.length];
        for(var row = 0; row < matrix.length; row++)
            for (var col = 0; col < matrix[row].length; col++)
                transpose[col][row] = matrix[row][col];
        return transpose;
    }
}
