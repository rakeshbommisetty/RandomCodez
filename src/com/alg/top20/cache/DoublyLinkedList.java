package com.alg.top20.cache;

public class DoublyLinkedList {
	/*
	 * this is the circular Doubly linked list
	 */
private DListNode head;
private int size;

public DoublyLinkedList(){
	head = new DListNode();
	size =0;
	
}

//at last
public void removeAndAdd(DListNode current){
	// unlink node from list
	current.prev.next = current.next;
	current.next.prev = current.prev;
	
	//attach node at end
	current.prev = head.prev;
	current.next = head;
	head.prev.next = current;
	head.prev = current;
}

//O(1)
public DListNode removeFirst(){
	DListNode temp = head.next;
	temp.next.prev = head;
	head.next = temp.next;
	--size;
	return temp;
}
//O(1)
public DListNode addLast(String key, Integer value){
	DListNode temp = new DListNode(key,value);
	temp.prev = head.prev;
	temp.next = head;
	head.prev.next = temp;
	head.prev = temp;
	++size;
	return null;
}

public void display(){
	for(DListNode current = head.next; current != head; current = current.next){
		System.out.println( current.key+ " :: "+current.value );
	}
}

public int size() {
	
	return size;
	
	
}
}
