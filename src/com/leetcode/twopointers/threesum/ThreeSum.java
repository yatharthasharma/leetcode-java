package com.leetcode.twopointers.threesum;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        int p1;
        int p2;
        for (int i = 0; i < nums.length; i++) {
            p1 = 0;
            p2 = nums.length - 1;
            while (p1 < p2) {
                if (p1 == i) {
                    p1++;
                    continue;
                }
                if (p2 == i) {
                    p2--;
                    continue;
                }
                if (p1 != 0 && nums[p1] == nums[p1 - 1]) {
                    p1++;
                    continue;
                }
                if (p2 != nums.length - 1 && nums[p2] == nums[p2 + 1]) {
                    p2--;
                    continue;
                }
                int sum = nums[i] + nums[p1] + nums[p2];
                if (sum > 0) {
                    p2--;
                } else if (sum < 0) {
                    p1++;
                } else {
                    List<Integer> sumIII = new ArrayList<>();
                    sumIII.add(nums[i]);
                    sumIII.add(nums[p1]);
                    sumIII.add(nums[p2]);
                    Collections.sort(sumIII);
                    result.add(sumIII);
                    p1++;
                    p2--;
                }
            }
        }
        return result.stream().toList();
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}
