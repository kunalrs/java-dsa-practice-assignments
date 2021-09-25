package com.kunalsagar.assignments.array;

import java.util.Arrays;

/**
 * Challenge Source: LeetCode
 * URL: https://leetcode.com/problems/flipping-an-image/
 * */
public class FlipImage {
    public static void main(String[] args) {
        var image = new int[][] {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };

        var result = flipAndInvertImage(image);
        for(int[] output: result) {
            System.out.print(Arrays.toString(output) + " ");
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++) {
            var start = 0;
            var end = image[i].length - 1;
            while(start < end) {
                // flip
                var temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;

                start++;
                end--;
            }
            // Invert
            for(int j = 0; j < image[i].length; j++) {
                image[i][j] = image[i][j] > 0 ? 0 : 1;
            }
        }
        return image;
    }


    /**
     * Not used anymore
     * Flip is same as Swap function.
     * */
    public static void flip(int[] image, int start, int end) {
        var temp = image[start];
        image[start] = image[end];
        image[end] = temp;
    }
}
