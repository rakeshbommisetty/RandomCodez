package assignment.three;

import java.util.Random;

public class TestLinkedList {

	public static void main(String[] args) {
		Random r = new Random();
		int n = Integer.parseInt(args[0]);
		ListNode head = new ListNode();
		
		for(int i=0;i<n; ++i){
			
			addFirst(head, r.nextInt(n)+1);
		}
		
		System.out.println("firstrun");
		display(head);
		
		int count=0;
		ListNode temp = null;
		ListNode current;
		for(current=head.next; current.next!=null; current = current.next){
			++count;
			if(count==5)
				temp = current;
				
		}
		
		current.next = temp;
		//if loop exits remove loop and return head
		head = RemovingLoopLL.isLoopExists(head);
		
		System.out.println("second run:: isTrue:: ");
		
		
	display(head);
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
