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

        Set<Integer> largestSet = new HashSet<>();

        Set<Integer> startOfSequences = new HashSet<>();

        for (int num : numsSet) {
            if (!numsSet.contains(num - 1) && numsSet.contains(num + 1)) {
                startOfSequences.add(num);
            }
        }

        for (int num : startOfSequences) {
            Set<Integer> currentSequenceSet = new HashSet<>();
            currentSequenceSet.add(num);
            int currentNum = num + 1;
            while (numsSet.contains(currentNum - 1)) {
                currentSequenceSet.add(currentNum);
                if (largestSet.size() < currentSequenceSet.size()) {
                    largestSet = currentSequenceSet;
                }
                if(!numsSet.contains(currentNum+1)) {
                    break;
                }
                currentNum++;
            }
        }
        return Math.max(largestSet.size(), 1);
    }
}
