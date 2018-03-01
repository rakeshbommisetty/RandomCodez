package cache;

public class CircularDoublyLinkedList {
	
	private int size;
	private DListNode head;
	
	public CircularDoublyLinkedList(){
		head = new DListNode();//head is a dummy node created to use as a pointer
		size =0;
	}
	
	public DListNode addLast(String key,Integer value){
		DListNode newNode = new DListNode(key, value);
		newNode.prev = head.prev;
		newNode.next = head;
		head.prev.next = newNode;
		head.prev = newNode;
		++size;
		return newNode;
	}
	
	public DListNode remove(){
		DListNode temp = head.next;
		temp.next.prev = head;
		head.next = temp.next;
		temp.prev = null;
		temp.next = null;
		--size;
		return temp;
	}
	
	public void removeAndAdd(DListNode current){
		current.next.prev = current.prev;
		current.prev.next = current.next;
		
		head.prev.next = current;
		current.prev = head.prev;
		current.next = head;
		head.prev = current;
	}
	
	public int size(){
		return size;
	}
	
	public void display(){
		
		for(DListNode current = head.next; current!=head; current = current.next){
			System.out.println("key: "+current.key+" value: "+current.value);
		}
	}
	

}
