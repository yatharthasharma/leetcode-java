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
                    // this is for cases where only 1 or 2 elements left
                    // index can only ever be equals to p2 if elements in the array = 1 or 2. in that case, decrease the size
                    // of p2 to reduce search size to 1 length of array or to be able to break out of for loop as
                    // element is still not equal to target
                    p2--;
                } else {
                    p2 = index;
                }
            } else {
                if (p1 == index) {
                    // this is for cases where only 1 or 2 elements left
                    // in case of 2 elements, it reduces the size to element on p2 index.
                    // in case of 1 element, it will help us break out of for loop if the element is still not equal to target
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
