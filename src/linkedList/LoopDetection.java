package linkedList;
import java.util.Random;

import list.*;
public class LoopDetection {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		Random m = new Random();
		for(int i=0;i<10;++i){
			ll.add(m.nextInt(10) + 1);
		}
		
		Node last = ll.getLast();
		last.next = ll.getHead();
		
		findLoop(ll);
	}

	private static void findLoop(LinkedList ll) {
		Node head = ll.getHead();
		Node slow = head,fast= head;
		
		while(fast.next!=null && fast.next.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow){
				System.out.println("loop exists:: ");
				return;
			}
		}
		
		System.out.println("loop doesn't exists");
		
	}

}
