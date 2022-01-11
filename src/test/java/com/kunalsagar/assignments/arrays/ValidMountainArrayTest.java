package com.kunalsagar.assignments.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidMountainArrayTest {

    @Test
    public void test1() {
        var arr = new int[] {2,1};
        ValidMountainArray obj = new ValidMountainArray();
        var res = obj.validMountainArray(arr);
        assertEquals(false, res);
    }

    @Test
    public void test2() {
        var arr = new int[] {3,5,5};
        ValidMountainArray obj = new ValidMountainArray();
        var res = obj.validMountainArray(arr);
        assertEquals(false, res);
    }

    @Test
    public void test3() {
        var arr = new int[] {0,3,2,1};
        ValidMountainArray obj = new ValidMountainArray();
        var res = obj.validMountainArray(arr);
        assertEquals(true, res);
    }

}