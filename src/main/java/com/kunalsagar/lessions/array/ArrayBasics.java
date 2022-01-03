package com.kunalsagar.lessions.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        storeRollNo();
    }

    static void storeRollNo() {
        int[] rollNo= new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < rollNo.length; i++) {
            System.out.println("Enter roll No: ");
            rollNo[i] = in.nextInt();
        }
        System.out.println("\nYou have entered...\n");

        System.out.println(Arrays.toString(rollNo));
    }
}
