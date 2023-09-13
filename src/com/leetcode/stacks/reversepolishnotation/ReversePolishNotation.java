package com.leetcode.stacks.reversepolishnotation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class ReversePolishNotation {
    Stack<Integer> nums = new Stack<>();
    Set<String> operands = new HashSet<>(List.of("*", "/", "+", "-"));

    private void performOperation(String operand) {
        int secondNum = nums.pop();
        int firstNum = nums.pop();
        switch (operand) {
            case "*" -> nums.push(firstNum * secondNum);
            case "/" -> nums.push(firstNum / secondNum);
            case "+" -> nums.push(firstNum + secondNum);
            case "-" -> nums.push(firstNum - secondNum);
            default -> throw new IllegalStateException("Unexpected value: " + operand);
        }
    }

    public int evalRPN(String[] tokens) {
        for (String s : tokens) {
            if (operands.contains(s)) {
                performOperation(s);
            } else {
                nums.push(Integer.parseInt(s));
            }
        }
        return nums.pop();
    }
}
