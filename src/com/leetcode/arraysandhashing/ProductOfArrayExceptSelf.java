package com.leetcode.arraysandhashing;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int[] prefix = new int[numsLength];
        int[] suffix = new int[numsLength];
        int[] product = new int[numsLength];
        prefix[0] = 1;
        suffix[numsLength - 1] = 1;
        for (int i = 1; i < numsLength; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        for (int i = numsLength - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < numsLength; i++) {
            product[i] = prefix[i] * suffix[i];
        }
        return product;
    }
}
