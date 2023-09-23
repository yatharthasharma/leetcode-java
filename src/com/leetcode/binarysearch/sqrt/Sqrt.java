package com.leetcode.binarysearch.sqrt;

public class Sqrt {
    public static int mySqrt(int x) {
        int counter = x / 2;
        int previousMax = 0;
        while (counter <= x) {
            if (counter * counter == x) {
                return counter;
            } else if (counter * counter < x) {
                previousMax = counter;
                counter *= 2;
            } else if (counter * counter > x) {
                if (previousMax >= counter / 2) {
                    return previousMax;
                }
                counter /= 2;
            }
        }
        return Math.max(counter, previousMax);
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(0));
    }
}
