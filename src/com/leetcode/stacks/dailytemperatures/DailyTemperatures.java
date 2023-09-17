package com.leetcode.stacks.dailytemperatures;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temps = new Stack<>();
        Stack<Integer> indices = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!temps.isEmpty() && temperatures[i] > temps.peek()) {
                result[indices.peek()] = i - indices.pop();
                temps.pop();
            }
            temps.push(temperatures[i]);
            indices.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }
}
