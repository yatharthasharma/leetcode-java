package com.leetcode.stacks.validparantheses;

import java.util.*;

public class ValidParantheses {
    public static boolean isValid(String s) {
        Stack<Character> addedOpenChars = new Stack<>();
        char[] charArray = s.toCharArray();
        if (charArray.length % 2 != 0) {
            return false;
        }

        boolean initialInsertion = true;
        for (char c : charArray) {
            Map<Character, Character> setsOfChars = new HashMap<>();
            setsOfChars.put('[', ']');
            setsOfChars.put('{', '}');
            setsOfChars.put('(', ')');
            if (initialInsertion) {
                if (setsOfChars.containsKey(c)) {
                    addedOpenChars.push(c);
                    initialInsertion = false;
                } else {
                    return false;
                }
            } else {
                if (setsOfChars.containsKey(c)) {
                    addedOpenChars.push(c);
                } else {
                    for (Map.Entry<Character, Character> entry : setsOfChars.entrySet()) {
                        if (entry.getValue() == c) {
                            try {
                                if (addedOpenChars.peek().equals(entry.getKey())) {
                                    addedOpenChars.pop();
                                } else {
                                    return false;
                                }
                            } catch (EmptyStackException ex) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return addedOpenChars.isEmpty();
    }
}
