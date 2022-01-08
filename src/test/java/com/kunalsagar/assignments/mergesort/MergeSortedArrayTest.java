package com.kunalsagar.assignments.mergesort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    public void test1() {
        MergeSortedArray obj = new MergeSortedArray();
        var nums1 = new int[] {1,2,3,0,0,0};
        System.out.println(Arrays.toString(nums1));
        var m = 3;

        var nums2 = new int[] {2,5,6};
        var n = 3;
        obj.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        assertArrayEquals(new int[] {1,2,2,3,5,6}, nums1);
    }

    @Test
    public void test2() {
        MergeSortedArray obj = new MergeSortedArray();
        var nums1 = new int[] {4, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(nums1));
        var m = 1;

        var nums2 = new int[] {1, 2, 3, 5, 6};
        var n = 5;
        obj.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        assertArrayEquals(new int[] {1,2,3,4,5,6}, nums1);
    }

}