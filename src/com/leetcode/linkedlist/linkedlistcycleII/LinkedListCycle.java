package com.leetcode.linkedlist.linkedlistcycleII;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static class ListNode {
        protected ListNode next;
    }

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> items = new HashSet<>();
        ListNode cur = head;
        if (cur == null) {
            return null;
        }
        while (!items.contains(cur)) {
            if (cur.next == null) {
                return null;
            }
            items.add(cur);
            cur = cur.next;
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(new LinkedListCycle().detectCycle(null));
    }
}
