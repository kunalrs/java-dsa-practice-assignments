package com.kunalsagar.assignments.arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromArrayTest {

    @Test
    public void test1() {
        RemoveDuplicatesFromArray obj = new RemoveDuplicatesFromArray();
        var nums = new int[] {1,1,2};
        System.out.println(Arrays.toString(nums));
        var output = new int[] {1,2,1};
        var k = 2;
        var k_ = obj.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(k_);
        assertEquals(k, k_);
        assertArrayEquals(output, nums);

    }

    @Test
    public void test2() {
        RemoveDuplicatesFromArray obj = new RemoveDuplicatesFromArray();
        var nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(nums));
        var output = new int[] {0,1,2,3,4,0,1,1,2,3};
        var k = 5;
        var k_ = obj.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(k_);
        assertEquals(k, k_);
        assertArrayEquals(output, nums);
    }



}