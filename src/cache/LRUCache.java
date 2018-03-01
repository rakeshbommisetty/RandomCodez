package cache;

import java.util.HashMap;

public class LRUCache implements ICache{

	private CircularDoublyLinkedList list;
	private HashMap<String, DListNode> hmcache;
	private int capacity;
	
	
	public LRUCache(int capacity){
		hmcache = new HashMap<String,DListNode>();
		list = new CircularDoublyLinkedList();
		this.capacity=capacity;
	}
	
	@Override
	public void put(String key, Integer value) {
	
		if(hmcache.containsKey(key)){
			DListNode temp = hmcache.get(key);
			temp.value = value;
			hmcache.put(key, temp);
			list.removeAndAdd(temp);
		
		}else{
			if(list.size()>=capacity){
				DListNode temp = list.remove();
				hmcache.remove(temp.key);
				
			}
			DListNode tempNode = list.addLast(key, value);
			hmcache.put(key, tempNode);
		}
		
		
	}

	@Override
	public Integer get(String key) {
		DListNode temp = hmcache.get(key);
		if(temp==null) return null;
		list.removeAndAdd(temp);
		return temp.value;
		
		
	}

	@Override
	public void display() {
		list.display();
		
	}

	@Override
	public int size() {
		
		return list.size();
		
		
	}

	@Override
	public int capacity() {
		
		return capacity;
		
		
	}

}
