package com.kunalsagar.assignments.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNAndDoubleTest {

    @Test
    public void test1() {
        CheckNAndDouble obj = new CheckNAndDouble();
        var arr = new int[]{10,2,5,3};
        boolean result = obj.checkIfExist(arr);
        assertEquals(true, result);
    }

    @Test
    public void test2() {
        CheckNAndDouble obj = new CheckNAndDouble();
        var arr = new int[]{7,1,14,11};
        boolean result = obj.checkIfExist(arr);
        assertEquals(true, result);
    }

    @Test
    public void test3() {
        CheckNAndDouble obj = new CheckNAndDouble();
        var arr = new int[]{3,1,7,11};
        boolean result = obj.checkIfExist(arr);
        assertEquals(false, result);
    }

}