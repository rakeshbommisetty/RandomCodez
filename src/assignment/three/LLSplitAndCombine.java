package assignment.three;


public class LLSplitAndCombine {

	public static ListNode splitAndCombine(ListNode head) {
		ListNode slow= head.next, fast=head.next;
		
		while(fast.next!=null && fast.next.next!=null){
			fast = fast.next.next;
			slow = slow.next;
		}
		
		
		if(fast.next == null){
			fast.next = head.next;
		}else if(fast.next.next == null){
			fast.next.next = head.next;
		}
		
		head.next = slow.next;
		slow.next = null;
		
		return head;
		
		
	}
	 
}
