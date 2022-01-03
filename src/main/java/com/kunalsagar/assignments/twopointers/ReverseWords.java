package com.kunalsagar.assignments.twopointers;
/**
 * LeetCode https://leetcode.com/problems/reverse-words-in-a-string-iii/
 * */
public class ReverseWords {
    public static void main(String[] args) {
        var s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        // find space mark end character
        StringBuilder sb = new StringBuilder();
        var start = 0;
        for (var i = 0; i < s.length(); i++) {
            if(Character.isSpaceChar(s.charAt(i)) || i == s.length() - 1) {

                var end = i - 1;

                if(i == s.length() - 1) {
                    end++;
                }

                while(start <= end) {
                    sb.append(s.charAt(end));
                    end--;
                }
                start = i + 1;
                if(i != s.length() - 1)
                    sb.append(" ");
            }
        }
        return sb.toString();
    }

}
