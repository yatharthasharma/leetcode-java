package com.leetcode;

import java.util.Arrays;

import static com.leetcode.arraysandhashing.ArraysAndHashing.*;
import static com.leetcode.arraysandhashing.ProductOfArrayExceptSelf.productExceptSelf;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println(containsDuplicate(new int[]{1, 2, 3}));
        out.println(isAnagram("aacc", "ccac"));
        out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 7)));
        out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
        out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}