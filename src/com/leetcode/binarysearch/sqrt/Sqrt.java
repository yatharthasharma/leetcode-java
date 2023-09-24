package com.leetcode.binarysearch.sqrt;

import static java.lang.System.out;

public class Sqrt {
    public static int mySqrt(int x) {
        int p1 = 0;
        int p2 = x;
        int previousMax = 0;
        while (p1 <= p2) {
            // addition is done this way because of the same reason mentioned in GuessGameI solution - int overflow problem
            long mid = (p1 + p2) / 2;
            if(mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                previousMax = (int) mid;
                p1 = (int) (mid + 1);
            } else {
                p2 = (int) (mid - 1);
            }
        }
        return previousMax;
    }

    public static void main(String[] args) {
        out.println(mySqrt(4));
        out.println(mySqrt(8));
        out.println(mySqrt(0));
        out.println(mySqrt(1000000));
        out.println(mySqrt(1));
    }
}
