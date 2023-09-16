package com.leetcode.twopointers.containerwithmostwater;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length - 1;
        int maxArea = 0;
        while (p1 < p2) {
            int length = p2 - p1;
            int breadth = Math.min(height[p2], height[p1]);
            if (length * breadth > maxArea) {
                maxArea = length * breadth;
            }
            if (height[p1] <= height[p2]) {
                p1++;
            } else {
                p2--;
            }
        }
        return maxArea;
    }
}
