package com.leetcode.linked_list;

public class CopyLinkedListWithRandomPointers {

    // #138
    public ListNode copyRandomList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode t1 = dummy;
        ListNode t2 = head;
        //1. Clone without random
        while(t2 != null) {
            ListNode newNode = new ListNode(t2.val);
            t1.next = newNode;
            t1 = t1.next;
            t2 = t2.next;
        }
        ListNode head2 = dummy.next;

        //2. Connect in zig-zag order
        t1 = head;
        t2 = head2;
        while(t1 != null && t2 != null) {
            ListNode n1 = t1.next;
            ListNode n2 = t2.next;

            t1.next = t2;
            t2.next = n1;

            t1 = n1;
            t2 = n2;
        }

        //3. Set random pointer
        t1 = head;

        while(t1 != null) {
            t1.next.random = t1.random == null ? null : t1.random.next;
            t1 = t1.next.next;
        }

        //4. Re-arrange
        ListNode d1 = new ListNode(-1);
        t1 = d1;

        ListNode d2 = new ListNode(-1);
        t2 = d2;

        ListNode temp = head;
        while(temp != null) {
            t1.next = temp;
            t2.next = temp.next;
            t1 = t1.next;
            t2 = t2.next;
            temp = temp.next.next;
        }
        t1.next = null;
        t2.next = null;

        //5. return cloned head
        return d2.next;
    }
}
