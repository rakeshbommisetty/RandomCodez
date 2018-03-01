package assignment.three;

import java.util.Random;




public class SortingLinkedList {
	
	
	public static void addFirst(ListNode head, ListNode list){
		ListNode temp = list;
		list.next = head.next;
		head.next = list;
		
	}
	
	public static void addFirst(ListNode head, int i){
			ListNode list = new ListNode(i);
			list.next = head.next;
			head.next = list;
			
		}
	
	public static void main(String[] args) {
		Random r = new Random();
		int n = Integer.parseInt(args[0]);
		ListNode head = new ListNode();
		ListNode list=null;
		for (int i=1; i<=n;i++){
			list = new ListNode(r.nextInt(n)+1);
			addFirst(head, list );
		}
		
		display(head);
		ListNode res = sortLL(head);
		display(head);
		System.out.println(res);
	}
	
	
	public static void display(ListNode head) {
		// O(n)
		ListNode current = head.next;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static ListNode sortLL(ListNode head){
		if(head==null && head.next==null){
			return head;
		}
		
		ListNode left = head;
		ListNode right = null;
		
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast!= null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		
		slow.next = null;
		right = slow;
		
		ListNode h1 = sortLL(left);
		ListNode h2 = sortLL(right);
		
		ListNode merged = merge(h1, h2);
		
		return merged;
		
	}

	private static ListNode merge(ListNode h1, ListNode h2) {
		
		ListNode result = null;
		
		if(h1 == null){
			return h2;
		}else if(h2 == null){
			return h1;
		}
		
		if(h1.data <= h2.data){
			result = h1;
			result.next = merge(h1.next, h2);
		}else{
			result = h2;
			result.next = merge(h1, h2.next);
		}
		
		
		return result;
		
		
	}

}
