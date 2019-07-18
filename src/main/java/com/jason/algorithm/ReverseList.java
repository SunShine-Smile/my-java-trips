package com.jason.algorithm;

import org.apache.http.Header;

import com.jason.algorithm.PrintListFromTailToHead.ListNode;

public class ReverseList {

	public static void main(String[] args) {
		
	}
	
	public static ListNode ReverseList1(ListNode node) {
		if(node == null || node.next == null) {
			return node;
		}
		ListNode next = node.next;
		node.next = null;
		ListNode newNode = ReverseList1(next);
		next.next = node;
		return newNode;
	}
}
