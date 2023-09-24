package com.leetcode.binarysearch.guessgame;

import static java.lang.System.out;

public class GuessGameI {
    public static int guess(int n) {
        long num = 1;
        if (n == num) {
            return 0;
        }
        return n > num ? -1 : 1;
    }

    public static int guessNumber(int n) {
        int p1 = 0;
        int p2 = n;
        while (p1 <= p2) {
            // addition is done in this way because if we directly do (p1+p2)/2 then it could result in integer overflow
            // for big numbers closer to the range of upper limits of 32 bits int type
            // so we separately divide both pointers by 2.0 to ensure we get double values, then add and cast to int
            int mid = (int) ((p1 / 2.0) + (p2 / 2.0));
            int guessAnswer = guess(mid);
            if (guessAnswer == 0) {
                return mid;
            } else if (guessAnswer == 1) {
                p1 = mid + 1;
            } else if (guessAnswer == -1) {
                p2 = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        out.println(guessNumber(1));
    }
}
