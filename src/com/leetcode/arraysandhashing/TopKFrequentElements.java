package com.leetcode.arraysandhashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// TODO incorrect / incomplete solution
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsCount = new HashMap<>();
        Arrays.stream(nums).forEach(num -> {
            Integer existingCount = numsCount.get(num);
            if (existingCount != null) {
                numsCount.replace(num, existingCount + 1);
            } else {
                numsCount.put(num, 1);
            }
        });
        return new int[0];
    }
}
