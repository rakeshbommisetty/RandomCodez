package com.alg.top20.cache;

import java.util.HashMap;

/*
 * Linkedhashmap is used for implementing cache. Refer onenote for delegation, composition etc.
 * hashmap is used to find the index of the linked list where actual data is located. As hashmap get key is
 * constant, we can reduce the get to O(1). 
 */
public class LinkedHashMapCache implements ICache {
	
private DoublyLinkedList list;
private HashMap<String, DListNode> index;
private int capacity;

public LinkedHashMapCache(int capacity){
	this.capacity = capacity;
	index = new HashMap<String, DListNode>(capacity); // to avoid rehashing
	list = new DoublyLinkedList();
}

	

	// total complexity is O 1
	@Override
	public Integer get(String key) {
		
			DListNode temp = index.get(key);  //O 1
			if(temp == null) return null;
			// we are doing removeandadd is to maintain LRU, by bringing current node to last location (MRU)
			list.removeAndAdd(temp);	// O 1
			return temp.value;
		
		
	}


private boolean isFull(){
	return list.size() == capacity;
}
	/*
	 * first make a call to hashmap for the key present or not. we will replace value if key exists. 
	 * secondly - cache full and if cache not full.
	 * OVer all complexity of below add operation is O(1)
	 * @see com.alg.top20.cache.ICache#add(java.lang.String, java.lang.Integer)
	 */
	@Override
	public void add(String key, Integer value) {
		DListNode temp = index.get(key); 
		// replace key if key exists in hashmap
		if(temp != null){
			temp.value = value;
			list.removeAndAdd(temp); // even when replace/override. That node from DLL should be kept at end MRU
		}else{
			// remove LRU element if cache is full
			if(isFull()){
				temp = list.removeFirst();
				index.remove(temp.key);
			}
				temp = list.addLast(key, value);
				index.put(key, temp);
			
			
		}
	}

	@Override
	public void display() {
		list.display();
		
	}

	@Override
	public int capacity() {
		
		return capacity;
		
		
	}

	@Override
	public int size() {
		
		return list.size();
		
		
	}

}
