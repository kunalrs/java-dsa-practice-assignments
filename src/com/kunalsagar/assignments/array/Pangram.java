package com.kunalsagar.assignments.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pangram {
    public static void main(String[] args) {
        var sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        List<Integer> alpha = sentence.chars().mapToObj(i -> (int)i).collect(Collectors.toList());
        boolean[] ans = new boolean[123];
        for (Integer i: alpha) {
            ans[i] = true;
        }

        for(int i = 97; i < 123; i++) {
            if(!ans[i]) {
               return false;
            }
        }
        return true;
    }
}
