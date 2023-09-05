package com.leetcode.arraysandhashing;

import java.util.*;

public class ArraysAndHashing {
    private ArraysAndHashing() {
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int num : nums) {
            if (uniqueNums.contains(num)) {
                return true;
            }
            uniqueNums.add(num);
        }
        return false;
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> stringS = new HashMap<>();
        Map<Character, Integer> stringT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            stringS.merge(c, 1, Integer::sum);
        }
        for (char c : t.toCharArray()) {
            stringT.merge(c, 1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : stringS.entrySet()) {
            if (!stringT.containsKey(entry.getKey()) || (stringT.containsKey(entry.getKey()) && !entry.getValue().equals(stringT.get(entry.getKey())))) {
                return false;
            }
        }
        return true;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer targetMinusInt = numbers.get(target - nums[i]);
            if (targetMinusInt != null) {
                return new int[]{targetMinusInt, i};
            }
            numbers.put(nums[i], i);
        }
        return new int[0];
    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        List<List<String>> list = new ArrayList<>();
        list.add(List.of(strings[0]));

        for (int i = 1; i < strings.length; i++) {
            boolean addToNewList = true;
            for (int j = 0; j < list.size(); j++) {
                List<String> s = list.get(j);
                if (isAnagram(strings[i], s.get(0))) {
                    List<String> listToAdd = new ArrayList<>(s);
                    listToAdd.add(strings[i]);
                    list.set(j, listToAdd);
                    addToNewList = false;
                    break;
                }
            }
            if (addToNewList) {
                list.add(List.of(strings[i]));
            }
        }
        return list;
    }
}
