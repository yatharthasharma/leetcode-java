package com.leetcode;

import static com.leetcode.arraysandhashing.ArraysAndHashing.containsDuplicate;
import static com.leetcode.arraysandhashing.ArraysAndHashing.isAnagram;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println(containsDuplicate(new int[]{1, 2, 3}));
        out.println(isAnagram("aacc", "ccac"));
    }
}