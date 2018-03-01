package com.alg.top20.LinkedListProblems;

import java.util.Random;

public class FindkthFromEnd {

	public static ListNode findKthElementFromHead(ListNode head, int k){
		int size =0;
		ListNode current;
		for(current = head.next; current !=null; current = current.next){
			++size;
		}
		int i=1;
		current = head.next;
		
		while(i++ <= (size-k)){
			current=current.next;
		}
		return current;
		
	}
	
	public static ListNode findKthElementFromHead2(ListNode head, int k){
		ListNode first = head, second = head;
		
		for(int i=1; i<=k;i++)
			second = second.next;
			while(second!=null){
				first = first.next;
				second = second.next;
			}
		return first;
	}

}
