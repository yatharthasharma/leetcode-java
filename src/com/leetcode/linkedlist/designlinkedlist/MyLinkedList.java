package com.leetcode.linkedlist.designlinkedlist;

public class MyLinkedList {
    private LinkedNode head;

    public MyLinkedList() {
        this.head = null;
    }

    public int get(int index) {
        LinkedNode currentElem = head;
        if (index == 0) {
            return head != null ? head.getVal() : -1;
        }
        for (int i = 1; i <= index; i++) {
            currentElem = currentElem.getNext();
            if (currentElem == null) {
                return -1;
            }
        }
        return currentElem.getVal();
    }

    public void addAtHead(int val) {
        if (get(0) == -1) {
            head = new LinkedNode(val);
        } else {
            LinkedNode oldHead = head;
            head = new LinkedNode(val);
            head.setNext(oldHead);
        }
    }

    public void addAtTail(int val) {
        if (head == null) {
            head = new LinkedNode(val);
            return;
        }
        LinkedNode next = head;
        while (next.getNext() != null) {
            next = next.getNext();
        }
        next.setNext(new LinkedNode(val));
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
        }
        int currIndex = 1;
        LinkedNode prevNode = head;
        while (prevNode != null) {
            if (index == currIndex) {
                LinkedNode newNode = new LinkedNode(val);
                newNode.setNext(prevNode.getNext());
                prevNode.setNext(newNode);
                break;
            }
            prevNode = prevNode.getNext();
            currIndex++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            if (get(index) != -1) {
                head = head.getNext();
            }
        } else {
            int currIndex = 1;
            LinkedNode prevNode = head;
            while (get(currIndex) != -1) {
                if (index == currIndex) {
                    prevNode.setNext(prevNode.getNext().getNext());
                    break;
                }
                prevNode = prevNode.getNext();
                currIndex++;
            }
        }
    }

    private static class LinkedNode {
        private final int val;
        private LinkedNode next;

        public int getVal() {
            return val;
        }

        public LinkedNode getNext() {
            return next;
        }

        LinkedNode(int val) {
            this.val = val;
            this.next = null;
        }

        public void setNext(LinkedNode next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // ["MyLinkedList","addAtHead","addAtHead","addAtHead","addAtIndex","deleteAtIndex","addAtHead","addAtTail","get","addAtHead","addAtIndex","addAtHead"]
        // [[],[7],[2],[1],[3,0],[2],[6],[4],[4],[4],[5,0],[6]]
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addAtHead(7);
        myLinkedList.addAtHead(2);
        myLinkedList.addAtHead(1);
        printList(myLinkedList);

        myLinkedList.addAtIndex(3, 0);
        printList(myLinkedList);

        myLinkedList.deleteAtIndex(2);
        printList(myLinkedList);

        myLinkedList.addAtHead(6);
        printList(myLinkedList);

        myLinkedList.addAtTail(4);
        myLinkedList.addAtHead(4);
        myLinkedList.addAtIndex(5, 0);
        myLinkedList.addAtHead(6);
    }

    private static void printList(MyLinkedList linkedList) {

        int i = 0;
        while (linkedList.get(i) != -1) {
            System.out.print(linkedList.get(i) + ",");
            i++;
        }
        System.out.println("->end of list->");
    }
}