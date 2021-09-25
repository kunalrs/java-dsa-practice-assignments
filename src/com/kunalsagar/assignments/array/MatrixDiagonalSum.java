package com.kunalsagar.assignments.array;
/**
 * Challenge source: LeetCode
 * URL: https://leetcode.com/problems/matrix-diagonal-sum/
 * */
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        var mat = new int[][] {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        var sum = 0;
        for(var row = 0; row < mat.length; row++)
            for(var col = 0; col < mat[row].length; col ++)
                if(row == col)
                    sum += mat[row][col];
                else if(col == mat.length - 1 - row)
                    sum += mat[row][col];

        return sum;
    }
}
