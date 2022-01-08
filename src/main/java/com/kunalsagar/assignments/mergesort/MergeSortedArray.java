package com.kunalsagar.assignments.mergesort;
/**
 * LeetCode https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
 * */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, k = 0;
        while(i < m && j < n) {
            if(nums2[j] < nums1[i]) {
                moveElements(nums1, i);
                nums1[i++] = nums2[j++];
                m++;
            } else {
                i++;
            }
            k++;
        }
        while(k < nums1.length && j < n) {
            nums1[k++] = nums2[j++];
        }
    }

    private void moveElements(int[] nums, int uptoIndex) {
        for(var i = nums.length - 2; i >= uptoIndex; i--) {
            nums[i + 1] = nums[i];
        }
    }
}
