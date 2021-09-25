package com.kunalsagar.lessions;

public class SumDigits {

    public static void main(String[] args) {
        SumDigits(111111);
    }

    static void SumDigits(int num) {
        int sum = 0;
        while (num > 0) {

            sum += num % 10;
            num = num / 10;
        }

        System.out.println(sum);
    }
}
