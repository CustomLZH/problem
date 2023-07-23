package com.custom.leetcode.topic;

/**
 *
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
 *
 * 返回同样按升序排列的结果链表。
 *
 * 状态：完成
 * @Author: Custom
 * @Date: 2021/1/24 17:48
 * @Version: 1.0
 */
public class Test83 {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                ListNode temp = p.next.next;
                p.next.next = null;
                p.next = temp;
            }else {
                p = p.next;
            }
        }
        return head;
    }
}
