package com.leetcode.twopointers.validpalindrome;

import java.util.Stack;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] sanitisedStringChars = s.replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        int p1 = 0;
        int p2 = sanitisedStringChars.length - 1;
        while(p1 <= p2) {
            if(sanitisedStringChars[p1] != sanitisedStringChars[p2]) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
