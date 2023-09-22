package com.leetcode.binarysearch.binarysearch;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            }
            return -1;
        }
        int p1 = 0;
        int p2 = nums.length - 1;
        while (p1 <= p2) {
            int index = ((p2 + p1) % 2 == 0) ? (p2 + p1) / 2 : (p2 + p1 + 1) / 2;
            int checkIndexValue = nums[index];
            if (checkIndexValue == target) {
                return index;
            } else if (checkIndexValue > target) {
                if(p2 == index) {
                    if(nums[p1] == target) {
                        return p1;
                    }
                    return -1;
                }
                p2 = index;
            } else {
                if(p1 == index) {
                    if(nums[p2] == target) {
                        return p2;
                    }
                    return -1;
                }
                p1 = index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 2));
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 9));
    }

}
