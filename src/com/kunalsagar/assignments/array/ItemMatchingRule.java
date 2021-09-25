package com.kunalsagar.assignments.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Challenge source: LeetCode
 * URL: https://leetcode.com/problems/count-items-matching-a-rule/
 * */
public class ItemMatchingRule {
    public static void main(String[] args) {
        var items = new ArrayList<List<String>>();

        var pixel = new ArrayList<String>();
        pixel.add("phone");
        pixel.add("blue");
        pixel.add("pixel");
        items.add(pixel);

        var lenovo = new ArrayList<String>();
        lenovo.add("computer");
        lenovo.add("silver");
        lenovo.add("lenovo");
        items.add(lenovo);

        var iphone = new ArrayList<String>();
        iphone.add("phone");
        iphone.add("gold");
        iphone.add("iphone");
        items.add(iphone);

        var ruleKey = "type";
        var ruleValue = "phone";

        System.out.println(countMatches(items, ruleKey, ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        var match = 0;
        for(List<String> item: items) {
            if(ruleKey.equals("type") && item.get(0).equals(ruleValue))
                match++;

            if(ruleKey.equals("color") && item.get(1).equals(ruleValue))
                match++;

            if (ruleKey.equals("name") && item.get(2).equals(ruleValue))
                match++;
        }
        return match;
    }
}
