package com.leetcode.linked_list;

public class IntersectionOfTwoLists {
    // #160
    //TC: 2*O(l1 + l2) SC: O(1)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode t1 = headA;
        ListNode t2 = headB;
        int s1 = size(t1);
        int s2 = size(t2);
        if(s1 > s2) {
            int diff = s1 - s2;
            while(diff != 0) {
                t1 = t1.next;
                diff--;
            }
        }  else {
            int diff = s2 - s1;
            while(diff != 0) {
                t2 = t2.next;
                diff --;
            }
        }
        while(t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
    private int size(ListNode node) {
        int size = 0;
        while(node != null) {
            size++;
            node = node.next;
        }
        return size;
    }
}
