package com.alg.top20.set;

public class HashSet implements ISet {
	
	private ListNode[] htbl;
	private int size;
	private static final int INIT_BUCKETS = 11;
	private static final int THRESHOLD = 10;
	
	public HashSet(){
		htbl = new ListNode[INIT_BUCKETS];
		for(int i=0;i<INIT_BUCKETS;++i){
			htbl[i] = new ListNode();
		}
		size = 0;
	}
	
	private void rehash(){
/*		int newsize = 2*htbl.length;
		ListNode[] htbl_new = new ListNode[newsize];
		
		for(int i=0; i<newsize; i++)
			htbl_new[i] = new ListNode();
		for(int i=0; i<htbl.length; ++i){
			ListNode tmp;
		
		for(ListNode current = htbl[i].next; current = tmp){
			tmp = current.next;
			int newindex = current.data.hashCode() % newsize;
			current.next = htbl_new[newindex].next
			htbl_new[newindex].next = current
		}
		}
		htbl = htbl_new;*/
	}

	/*
	 * average bucket size = load factor = no.of keys/bucket; i.e how many linked list nodes are there in each list location. THRESHOLD is no.of elements in each bucket
	 * @see com.alg.top20.set.ISet#add(java.lang.Integer)
	 */
	@Override
	public boolean add(Integer key) {
		if(size/htbl.length > THRESHOLD)
			rehash();
		
		int bindex = key.hashCode() % htbl.length;
		ListNode current = htbl[bindex];
		
		for(; current.next!=null; current = current.next){
			if(current.next.data.equals(key))
				return false;
				
		}
		
		current.next = new ListNode(key);
		++size;
		return true;

		
		

	}

	/*
	 * Hashcode in Object class returns only the address. So it is mandatory to override Hashcode in your code.
	 * For getting hashcode, use content of the object instead of using address, as address keeps changing and
	 * while getting it can't fetch properly
	 * @see com.alg.top20.set.ISet#contains(java.lang.Integer)
	 */
	@Override
	public boolean contains(Integer key) {
		int bindex = key.hashCode() % htbl.length;
		ListNode current = htbl[bindex].next;
		
		for(; current!=null; current = current.next){
			if(current.data.equals(key))
				return true;
		}
		return false;

	}

	@Override
	public boolean remove(Integer key) {
		int bindex = key.hashCode() % htbl.length;
		ListNode current = htbl[bindex];
		
		for(; current.next!=null; current = current.next){
			if(current.next.data.equals(key))
				current.next = current.next.next;	// in display we used current node. But we can't delete with current node pointer. So we are starting from head
			--size;	
			return true;
		}
		

		return false;

	}

	@Override
	public int size() {

		return size;

	}

	@Override
	public void display() {
		for(int i=0; i< htbl.length; ++i){
			System.out.println("bucket- "+i+":");
			for(ListNode current = htbl[i].next; current!=null; current = current.next){
				System.out.println(current.data+ " ");
			}
			System.out.println();
		}
	}

}
