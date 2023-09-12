package com.leetcode.arraysandhashing.longestconsecutivesequence;

import java.util.*;

public class LongestConsecutiveSequence {
    private LongestConsecutiveSequence() {
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }

        int longestLength = 1;

        for (int num : numsSet) {
            if (!numsSet.contains(num - 1)) {
                int currentLength = 1;
                int currentNum = num + 1;
                while (numsSet.contains(currentNum)) {
                    currentLength++;
                    if (currentLength > longestLength) {
                        longestLength = currentLength;
                    }
                    if (!numsSet.contains(currentNum + 1)) {
                        break;
                    }
                    currentNum++;
                }
            }
        }
        return longestLength;
    }
}
