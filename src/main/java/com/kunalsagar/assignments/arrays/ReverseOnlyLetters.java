package com.kunalsagar.assignments.arrays;
/**
 * LeetCode https://leetcode.com/problems/reverse-only-letters/
 * */
public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int l = 0, r = s.length() - 1;
        while(l < r) {
            if(!Character.isAlphabetic(s.charAt(l)))
                l++;
            else if (!Character.isAlphabetic(s.charAt(r)))
                r--;
            else {
                char temp = s.charAt(l);
                ch[l] = s.charAt(r);
                ch[r] = temp;
                l++; r--;
            }
        }
        return String.valueOf(ch);
    }
}
