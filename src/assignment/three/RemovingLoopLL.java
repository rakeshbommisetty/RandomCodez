package assignment.three;

public class RemovingLoopLL {

	public static ListNode isLoopExists(ListNode head) {
		ListNode first = head, second = head, temp = null;
		
		while(second.next.next!=null){
			first = first.next;
			second = second.next.next;
			
			if(first == second){
				System.out.println("Loop exits");
				break;
			}
		}
		
		first = head;
		
		while(first!=second){
			first = first.next;
			temp = second;
			second = second.next;
		}
		
		temp.next = null;
		
		return head;
		
		
	}

}
