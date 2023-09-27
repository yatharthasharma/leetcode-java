package com.leetcode.binarysearch.rotatedsortedarray;

public class RotatedSortedArrayI {
    public static int search(int[] nums, int target) {
        int p1 = 0;
        int p2 = nums.length - 1;
        while (p1 <= p2) {
            int mid = (p1 + p2) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target == nums[p1]) {
                return p1;
            } else if (target == nums[p2]) {
                return p2;
            } else if (target < nums[p1]) {
                if (target > nums[p2]) {
                    return -1;
                } else {
                    if (nums[p1] < nums[mid]) {
                        p1 = mid + 1;
                    } else {
                        if (target < nums[mid]) {
                            p2 = mid - 1;
                        } else {
                            p1 = mid + 1;
                        }
                    }
                }
            } else if (target > nums[p1]) {
                if (nums[mid] < nums[p1]) {
                    p2 = mid - 1;
                } else {
                    if (target > nums[mid]) {
                        p1 = mid + 1;
                    } else {
                        p2 = mid - 1;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 8));
    }
}
