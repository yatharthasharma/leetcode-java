package com.leetcode.twopointers.twosumII;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length - 1;
        while (p1 < p2) {
            if (numbers[p1] + numbers[p2] == target) {
                return new int[]{p1 + 1, p2 + 2};
            }
            else if (numbers[p1] + numbers[p2] > target) {
                p2--;
            } else {
                p1++;
            }
        }
    }
}