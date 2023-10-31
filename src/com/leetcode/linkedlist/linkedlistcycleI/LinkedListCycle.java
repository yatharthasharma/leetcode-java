package com.leetcode.linkedlist.linkedlistcycleI;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public static class ListNode{ protected ListNode next;}
    public boolean hasCycle(ListNode head) {
        Set<ListNode> items = new HashSet<>();
        ListNode cur = head;
        if (cur == null) {
            return false;
        }
        while(!items.contains(cur)) {
            if(cur.next == null) {
                return false;
            }
            items.add(cur);
            cur = cur.next;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new LinkedListCycle().hasCycle(null));
    }
}
