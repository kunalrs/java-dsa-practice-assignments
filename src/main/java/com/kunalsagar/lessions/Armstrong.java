package com.kunalsagar.lessions;

public class Armstrong {

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++)
            if (isArmstrong(i))
                System.out.println(i);
    }

    static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        while(num > 0) {
            int n = num % 10;
            num = num / 10;
            sum += n * n * n;
        }

        return sum == original;
    }
}
