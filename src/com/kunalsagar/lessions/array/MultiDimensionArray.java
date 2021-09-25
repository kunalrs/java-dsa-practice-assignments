package com.kunalsagar.lessions.array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        /**
         * [
         *   [1, 2, 3],
         *   [4, 5, 6],
         *   [7, 8, 9]
         * ]
         * */

        // int[][] arr = new int[3][]; //optional to specify columns
        /**
            int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            }
         */

        int[][] arr = new int[3][2];
        Scanner in = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++)
            for(int col = 0; col < arr[row].length; col++)
                arr[row][col] = in.nextInt();

        System.out.println("[");

        for (int[] ints : arr)
            System.out.println("  " + Arrays.toString(ints));

        System.out.println("]");
    }
}
