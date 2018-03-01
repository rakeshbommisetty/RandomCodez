package com.alg.top20.oop.extensibility;

//import com.alg.top20.list.LinkedList.ListNode;

public class LinkedList implements IList {
	
	private class ListNode {
		Integer data;
		ListNode next;
		public ListNode(Integer data) {
			this.data = data;
			this.next = null;
		}
		public ListNode(){
			
		}
	}
	
	private ListNode head;
	private ListNode last;
	private int size;
	
	public LinkedList() {
		head = new ListNode();
		last = head;
		size =0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public void add(Integer e){
		ListNode temp = new ListNode(e);
		last.next = temp;
		last = temp;
		++size;
		
	}
	
	public void display() {
		// O(n)
		ListNode current = head.next;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}



	

	@Override
	public void reverse() {
	}

	@Override
	public int get(Integer ind) {
		
		return 0;
		
		
	}

	@Override
	public void add(Integer ind, Integer e) {
	}

	@Override
	public void remove(Integer ind) {
	}

	@Override
	public void set(Integer ind, Integer e) {
	}

	@Override
	public boolean contains(Integer e) {
		
		return false;
		
		
	} 

}
