package com.kunalsagar.assignments.arrays;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    public void test1() {
        RemoveElement obj = new RemoveElement();
        var nums = new int[] {0,1,2,2,3,0,4,2};
        var val = 2;
        System.out.println(Arrays.toString(nums));
        System.out.println(val);
        var output = new int[] {0,1,4,0,3,2,2,2};
        var k = 5;
        var k_ = obj.removeElement(nums, val);
        System.out.println(Arrays.toString(nums));
        System.out.println(k_);
        assertEquals(k, k_);

    }

    @Test
    public void test2() {
        RemoveElement obj = new RemoveElement();
        var nums = new int[] {3,2,2,3};
        var val = 3;
        System.out.println(Arrays.toString(nums));
        System.out.println(val);
        var output = new int[] {2,2,3,3};
        var k = 2;
        var k_ = obj.removeElement(nums, val);
        System.out.println(Arrays.toString(nums));
        System.out.println(k_);
        assertEquals(k, k_);

    }

    @Test
    public void test3() {
        RemoveElement obj = new RemoveElement();
        var nums = new int[] {};
        var val = 0;
        System.out.println(Arrays.toString(nums));
        System.out.println(val);
        var output = new int[] {};
        var k = 0;
        var k_ = obj.removeElement(nums, val);
        System.out.println(Arrays.toString(nums));
        System.out.println(k_);
        assertEquals(k, k_);

    }

    @Test
    public void test4() {
        RemoveElement obj = new RemoveElement();
        var nums = new int[] {3, 3};
        var val = 3;
        System.out.println(Arrays.toString(nums));
        System.out.println(val);
        var output = new int[] {};
        var k = 0;
        var k_ = obj.removeElement(nums, val);
        System.out.println(Arrays.toString(nums));
        System.out.println(k_);
        assertEquals(k, k_);

    }

}