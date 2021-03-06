package com.jason.algorithm;

import java.util.ArrayList;

/**
 * @author Jason
 * @desc 从尾到头打印链表
 */
public class PrintListFromTailToHead {

    public static void main(String[] args) {
        ListNode listNode = null; // 自己组装下listNode /*new ListNode(3);*/
        PrintListFromTailToHead1(listNode);
    }

    /**
     * 使用递归
     * 要逆序打印链表 1->2->3（3,2,1)，可以先逆序打印链表 2->3(3,2)，最后再打印第一个节点 1。而链表 2->3 可以看成
     * 一个新的链表，要逆序打印该链表可以继续使用求解函数，也就是在求解函数中调用自己，这就是递归函数。
     */
    public static ArrayList<Integer> PrintListFromTailToHead1(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        if (listNode != null) {
            result.addAll(PrintListFromTailToHead1(listNode.next));
            result.add(listNode.val);
        }
        return result;
    }

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
