package com.leetcode.validpalindrome;

import java.util.Stack;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String sanitisedString = s.replaceAll("[^a-zA-Z0-9]", "");
        Stack<Character> characters = new Stack<>();
        for(char c : sanitisedString.toCharArray()) {
            characters.push(c);
        }
        for (char c : sanitisedString.toCharArray()) {
            if(c != characters.pop()) {
                return false;
            }
        }
        return true;
    }
}
