package com.leetcode.binarysearch.firstbadversion;

public class FirstBadVersion {
    static boolean isBadVersion(int version) {
        return version == 4 || version == 5;
    }

    public static int firstBadVersion(int n) {
        int p1 = 0;
        int p2 = n;
        int firstBadVersion = n;
        while (p1 < p2) {
            int mid = (int) (((double) p1 / 2) + ((double) p2 / 2));
            if (isBadVersion(mid)) {
                p2 = mid;
                firstBadVersion = Math.min(mid, firstBadVersion);
            } else {
                p1 = mid + 1;
            }
        }
        return Math.min(p1, firstBadVersion);
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));
    }
}
