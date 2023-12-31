package com.leetcode;

import com.leetcode.stacks.minstack.MinStack;
import com.leetcode.stacks.reversepolishnotation.ReversePolishNotation;

import java.util.Arrays;

import static com.leetcode.arraysandhashing.ArraysAndHashing.*;
import static com.leetcode.arraysandhashing.BuySellStock.maxProfit;
import static com.leetcode.arraysandhashing.ProductOfArrayExceptSelf.productExceptSelf;
import static com.leetcode.arraysandhashing.longestconsecutivesequence.LongestConsecutiveSequence.longestConsecutive;
import static com.leetcode.arraysandhashing.validsudoku.Sudoku.isValidSudoku;
import static java.lang.System.out;

public class Main {
    private static final char[][] CHARS = {
            {'3', '.', '.', '.', '.', '4', '.', '.', '.'},
            {'.', '.', '.', '.', '1', '.', '8', '.', '.'},
            {'.', '7', '2', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '5', '.', '.', '.', '.', '.', '.'},
            {'.', '4', '.', '.', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '3', '.', '.'},
            {'.', '.', '.', '.', '.', '.', '.', '.', '1'},
            {'1', '3', '.', '.', '.', '5', '.', '.', '.'},
            {'.', '.', '.', '.', '5', '.', '.', '2', '.'}
    };

    private static final ReversePolishNotation rpn = new ReversePolishNotation();

    private static void pastProblemOperations() {
        final MinStack minStack = new MinStack();
        out.println(containsDuplicate(new int[]{1, 2, 3}));
        out.println(isAnagram("aacc", "ccac"));
        out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 7)));
        out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4, 0, 2}));
        out.println(isValidSudoku(CHARS));
        out.println(longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        out.println(minStack.getMin());
        minStack.pop();
        out.println(minStack.top());
        out.println(minStack.getMin());
    }

    public static void main(String[] args) {
        pastProblemOperations();
        out.println(rpn.evalRPN(new String[]{"2","1","+","3","*"}));
    }
}