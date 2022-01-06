package com.kunalsagar.assignments.arrays;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        var nums = new int[] {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        var evens = 0;
        for(int num: nums){
            var count = 0;
            while(num > 0) {
                num = num / 10;
                count++;
            }
            if(count % 2 == 0)
                evens++;
        }

        return evens;
    }
}
