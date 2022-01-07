package com.kunalsagar.assignments.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateZerosTest {
    @Test
    public void Test1() {
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        var nums = new int[]{1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(nums));
        duplicateZeros.duplicateZeros(nums);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(new int[]{1,0,0,2,3,0,0,4}, nums);
    }

}