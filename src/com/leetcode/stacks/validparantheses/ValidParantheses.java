package com.leetcode.stacks.validparantheses;

import java.util.*;

public class ValidParantheses {
    public static boolean isValid(String s) {
        Deque<Character> addedOpenChars = new ArrayDeque<>();
        if (s.length() % 2 != 0) {
            return false;
        }

        for (char c : s.toCharArray()) {
            Set<Character> openingChars = new HashSet<>(List.of('[', '{', '('));
            if (openingChars.contains(c)) {
                addedOpenChars.push(c);
            } else {
                if (c == ']' && Objects.equals(addedOpenChars.peek(), '[')) {
                    addedOpenChars.pop();
                } else if (c == '}' && Objects.equals(addedOpenChars.peek(), '{')) {
                    addedOpenChars.pop();
                } else if (c == ')' && Objects.equals(addedOpenChars.peek(), '(')) {
                    addedOpenChars.pop();
                } else {
                    return false;
                }


            }
        }
        return addedOpenChars.isEmpty();
    }
}
