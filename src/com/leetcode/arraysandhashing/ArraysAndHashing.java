package com.leetcode.arraysandhashing;

import java.util.*;

public class ArraysAndHashing {
    private ArraysAndHashing() {}
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            if (uniqueNums.contains(num)) {
                return true;
            }
            uniqueNums.add(num);
        }
        return false;
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> stringS = new HashMap<>();
        Map<Character, Integer> stringT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            stringS.merge(c, 1, Integer::sum);
        }
        for (char c : t.toCharArray()) {
            stringT.merge(c, 1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : stringS.entrySet()) {
            if (!stringT.containsKey(entry.getKey()) || (stringT.containsKey(entry.getKey()) && !entry.getValue().equals(stringT.get(entry.getKey())))) {
                return false;
            }
        }
        return true;
    }
}
