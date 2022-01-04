package com.kunalsagar.assignments.slidingwindow;
/**
 * LeetCode https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * */
public class LongestSubStringWithoutRepeat {

    public static void main(String[] args) {
        var s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        int result = 0;
        for(var i = 0; i < s.length(); i++) {
            var charSeen = new boolean[256]; // 256 characters

            for(var j = i; j < s.length(); j++) {

                if(charSeen[s.charAt(j)]) {
                    break;
                } else {
                  result = Math.max(result, j - i + 1);
                  charSeen[s.charAt(j)] = true;
                }
            }

            charSeen[s.charAt(i)] = false;
        }

        return result;
    }
}
