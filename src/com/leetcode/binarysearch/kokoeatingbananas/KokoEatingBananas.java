package com.leetcode.binarysearch.kokoeatingbananas;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int num : piles) {
            if (num > max) {
                max = num;
            }
        }
        int p1 = 1;
        int p2 = max;
        int lowestBanansPerHour = max;
        while (p1 <= p2) {
            int mid = (p1 + p2) / 2;
            int hoursTakenThisTime = 0;
            for (int num : piles) {
                hoursTakenThisTime += (num % mid == 0 ? num / mid : ((num / mid) + 1));
                if (hoursTakenThisTime > h) {
                    break;
                }
            }
            if (hoursTakenThisTime > h) {
                p1 = mid + 1;
                continue;
            }
            if (mid <= lowestBanansPerHour) {
                lowestBanansPerHour = mid;
                p2 = mid - 1;
            }
        }
        return lowestBanansPerHour;
    }

    public static void main(String[] args) {
        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();
        System.out.println(kokoEatingBananas.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
    }
}
