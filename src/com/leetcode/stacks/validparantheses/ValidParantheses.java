package com.leetcode.stacks.validparantheses;

import java.util.*;

public class ValidParantheses {
    public static boolean isValid(String s) {
        Stack<Character> addedOpenChars = new Stack<>();

        if (s.length() % 2 != 0) {
            return false;
        }

        for (char c : s.toCharArray()) {
            Map<Character, Character> setsOfChars = new HashMap<>();
            setsOfChars.put(']', '[');
            setsOfChars.put('}', '{');
            setsOfChars.put(')', '(');
            if (setsOfChars.containsKey(c)) {
                try {
                    if(addedOpenChars.peek().equals(setsOfChars.get(c))) {
                        addedOpenChars.pop();
                    } else {
                        return false;
                    }
                } catch (EmptyStackException ex) {
                    return false;
                }

            } else {
                addedOpenChars.push(c);
            }
        }
        return addedOpenChars.isEmpty();
    }
}
