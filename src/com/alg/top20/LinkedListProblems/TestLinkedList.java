package com.alg.top20.LinkedListProblems;

import java.util.Random;



public class TestLinkedList {
	
	public static void addFirst(ListNode head, ListNode list){
	//	ListNode temp = list;
		list.next = head.next;
		head.next = list;
		
	}
	
	public static void addFirst(ListNode head, int i){
			ListNode list = new ListNode(i);
			list.next = head.next;
			head.next = list;
			
		}

	public static void main(String[] args) {
		Random r = new Random(100);
		int n = Integer.parseInt(args[0]);
		ListNode head = new ListNode();
		ListNode list=null;
		for (int i=1; i<=n;i++){
			list = new ListNode(r.nextInt(n)+1);
			addFirst(head, list );
		}
		
		//ListNode res = FindkthFromEnd.findKthElementFromHead(head, 2);
		ListNode res = FindkthFromEnd.findKthElementFromHead(head, 2);
		display(head);
		System.out.println(res);
	}
	
	
	public static void display(ListNode head) {
		// O(n)
		ListNode current = head.next;
		while (current != null) {
			System.out.print(current + " ");
			current = current.next;
		}
		System.out.println();
	}

}
