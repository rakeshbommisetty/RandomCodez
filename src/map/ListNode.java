package map;

public class ListNode {
	ListNode next;
	String key;
	Integer value;
	
	ListNode(){
		
	}
	
	ListNode(String key, Integer value){
		this.key = key;
		this.value = value;
		this.next = null;
	}
}
