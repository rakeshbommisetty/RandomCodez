package assignment.three;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CloningLL {
	
	public static void main(String[] args) {
		Random r = new Random();
		int n = Integer.parseInt(args[0]);
		ListNode head = new ListNode();
		
		for(int i=0;i<n; ++i){
			
			addFirst(head, r.nextInt(n)+1);
		}
		
		System.out.println("firstrun");
		display(head);
		
		cloneLL(head);
		System.out.println("second run");
	//	display(start);
	}

	private static void cloneLL(ListNode head) {
		ListNode newHead = new ListNode();
		ListNode firstNode = head.next;
		HashMap<ListNode, ListNode> hm = new HashMap<ListNode, ListNode>();
	
		for(ListNode currentNode = head.next; currentNode != null; currentNode = currentNode.next){
			ListNode lm = new ListNode();
			lm.data = currentNode.data;
			hm.put(currentNode, lm);
		}
		
		for(Map.Entry<ListNode, ListNode> entry: hm.entrySet()){
			
		}
	}

	private static void addFirst(ListNode head, Integer i) {
		ListNode temp = new ListNode(i);
		temp.next = head.next;
		head.next = temp;
		
	}
	
	private static void display(ListNode head){
		
		for(ListNode currentNode = head.next; currentNode != null; currentNode = currentNode.next){
			System.out.println(currentNode.data+ "->");
		}
	}

}
