package com.kunalsagar.assignments.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Challenge Source: LeetCode
 * URL: https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 * */
public class LuckyNumberInMatrix {

    public static void main(String[] args) {
        var matrix = new int[][]{
                {3,6},
                {7,1},
                {5,2},
                {4,8}
        };

        System.out.println(lucky(matrix));
    }

    private static List<Integer> lucky(int[][] matrix) {
        var lucky = new ArrayList<Integer>();
        var min = new int[matrix.length][];
        for(var i = 0; i < matrix.length; i++) {
            var rowMin = Integer.MAX_VALUE;
            for(var j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    min[i] = new int[] {i, j};
                }
            }
        }

        for(int i = 0; i < min.length; i++) {
            var m = min[i];
            var max = matrix[m[0]][ m[1]];
            var counter = 0;
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[j][m[1]] <= max) {
                    counter++;
                }
            }

            if(counter == matrix.length) {
                lucky.add(max);
            }
        }

        return lucky;
    }


}
