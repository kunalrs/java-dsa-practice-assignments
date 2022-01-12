package com.kunalsagar.assignments.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingSquaredArrayTest {

    @Test
    public void test1() {
        SortingSquaredArray obj = new SortingSquaredArray();
        var nums = new int[] {-4,-1,0,3,10};
        var output = obj.sortedSquares(nums);
        assertArrayEquals(new int[] {0,1,9,16,100}, output);
    }

    @Test
    public void test2() {
        SortingSquaredArray obj = new SortingSquaredArray();
        var nums = new int[] {-7,-3,2,3,11};
        var output = obj.sortedSquares(nums);
        assertArrayEquals(new int[] {4,9,9,49,121}, output);
    }

}