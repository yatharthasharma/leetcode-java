package com.leetcode.twopointers.twosumII;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length - 1; j >= 0; j--) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                } else if (numbers[i] + numbers[j] < target) {
                    break;
                }
            }
        }
        return new int[0];
    }
}