package com.leetcode.stacks.minstack;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    private final int[] stack;
    private int filledIndex = -1;
    private final List<Integer> minimums;

    public MinStack() {
        stack = new int[30000];
        minimums = new ArrayList<>();
    }

    public void push(int val) {
        filledIndex++;
        stack[filledIndex] = val;
        if(minimums.isEmpty()) {
            minimums.add(stack[filledIndex]);
        } else {
            if (stack[filledIndex] <= minimums.get(minimums.size() - 1)) {
                minimums.add(stack[filledIndex]);
            }
        }
    }

    public void pop() {
        if (minimums.get(minimums.size() - 1) == stack[filledIndex]) {
            minimums.remove(minimums.size() - 1);
        }
        filledIndex--;
    }

    public int top() {
        return stack[filledIndex];
    }

    public int getMin() {
        return minimums.get(minimums.size() - 1);
    }

}
