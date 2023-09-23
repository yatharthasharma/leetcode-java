package com.leetcode.binarysearch.binarysearch;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int p1 = 0;
        int p2 = nums.length - 1;
        while (p1 <= p2) {
            int index = (p2 + p1) / 2;
            if (nums[index] == target) {
                return index;
            } else if (nums[index] > target) {
                if (p2 == index) {
                    p2--;
                } else {
                    p2 = index;
                }
            } else {
                if (p1 == index) {
                    p1++;
                } else {
                    p1 = index;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9}, 9));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9}, 3));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9}, 2));
        System.out.println(search(new int[]{5}, 5));
    }

}
