package com.leetcode.linked_list;

public class ListNode {
    int val;
    ListNode next;
    ListNode random;

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val, ListNode next, ListNode random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }
}
