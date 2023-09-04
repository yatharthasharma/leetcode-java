package com.leetcode;

import java.util.Arrays;

import static com.leetcode.arraysandhashing.ArraysAndHashing.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println(containsDuplicate(new int[]{1, 2, 3}));
        out.println(isAnagram("aacc", "ccac"));
        out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 7)));
    }
}