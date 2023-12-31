package com.leetcode.arraysandhashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    private ProductOfArrayExceptSelf() {}
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

    // TODO: DO THIS AGAIN YOURSELF
    public static int[] improvedProductExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int[] product = new int[numsLength];
        Arrays.fill(product, 1);
        int value = 1;

        for (int i = 0; i < numsLength; i++) {
            product[i] *= value;
            value *= nums[i];
        }
        value = 1;
        for (int i = numsLength - 1; i >= 0; i--) {
            product[i] *= value;
            value *= nums[i];
        }

        return product;
    }
}
