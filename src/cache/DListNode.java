package cache;

public class DListNode {
	DListNode next;
	DListNode prev;
	String key;
	Integer value;
	
	public DListNode(){
		this.next = this.prev = this;
	}
	
	public DListNode(String key, Integer value){
		this.key = key;
		this.value = value;
		this.next = this;
		this.prev = this;
	}

}
