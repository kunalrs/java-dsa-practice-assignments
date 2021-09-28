package com.kunalsagar.lessions.linearsearch;

public class SeachInString {
    public static void main(String[] args) {
        var str = "Kunal Sagar";
        var target = 'q';
        System.out.println(search(str, target));
    }

    static boolean search(String str, char target) {
        for(char ch: str.toCharArray()) {
            if(ch == target)
                return true;
        }
        return false;
    }
}
