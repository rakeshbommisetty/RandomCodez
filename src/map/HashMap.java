package map;

public class HashMap implements Map {

	private static final float DEFAULT_LOAD_FACTOR = 0.75f;
	private static int INITIAL_CAPACITY = 1<< 4;
	private ListNode[] buckets;
	private int size;
	private static int THRESHOLD;
	
	
	
	public HashMap(){
		THRESHOLD = (int) (INITIAL_CAPACITY * DEFAULT_LOAD_FACTOR);
		size =0;
		buckets = new ListNode[INITIAL_CAPACITY];
//		we should create a dummy head node as in HashMap add node happens at First/head. So we need a dummy head
		for(int i=0;i<INITIAL_CAPACITY;++i){
			buckets[i] = new ListNode();
		}
	}
	
	public HashMap(int INITIAL_CAPACITY){
		this.INITIAL_CAPACITY = INITIAL_CAPACITY;
		THRESHOLD = (int) (this.INITIAL_CAPACITY * DEFAULT_LOAD_FACTOR);
		size =0;
		buckets = new ListNode[this.INITIAL_CAPACITY];
		for(int i=0;i<this.INITIAL_CAPACITY;++i){
			buckets[i] = new ListNode();
		}
	}
	
	@Override
	public boolean put(String key, Integer value) {
		
		int hash = Math.abs(key.hashCode());
		int index = hash % buckets.length;
		ListNode current;
		for(current = buckets[index]; current.next!=null; current = current.next){
			if(current.next.key.equals(key)){
				current.next.value = value;
				return true;
			}
		}
		
		if(size >= THRESHOLD){
			rehash();
		}
		
		index = Math.abs(key.hashCode()) % buckets.length;
		// the below code will work, as new node addition ll happen from head/first
		// so we are getting head node in below line and adding to next of head
		current = buckets[index];
		
		ListNode newNode = new ListNode(key,value);
		
		newNode.next = current.next;
		current.next = newNode;			
		++size;
		return true;
		
		
		
	}

	private void rehash() {
		ListNode[] newBuckets = new ListNode[2*buckets.length];
		
		for(int i=0;i<newBuckets.length;++i){
			newBuckets[i] = new ListNode();
		}
		
		for(int i=0;i<buckets.length;++i){
			for(ListNode current=buckets[i].next;current!=null;current=current.next){
				int index = Math.abs(current.key.hashCode()) % newBuckets.length;
				ListNode newNode = newBuckets[index];
				current.next = newNode.next;
				newNode.next = current;
				
			}
			
		}
		buckets = null;
		buckets = newBuckets;
		THRESHOLD = (int) (buckets.length * DEFAULT_LOAD_FACTOR);
	}

	@Override
	public Integer get(String key) {
		int index = Math.abs(key.hashCode())%buckets.length;
		
		for(ListNode current= buckets[index].next; current!=null; current = current.next){
			if(current.key.equals(key)){
				return current.value;
			}
		}
		
		return null;
		
		
	}

	@Override
	public String remove(String key) {
int index = Math.abs(key.hashCode())%buckets.length;
		ListNode prev=buckets[index];
		for(ListNode current= buckets[index].next; current!=null; current = current.next){
			if(current.key.equals(key)){
				prev.next = current.next;
				current.next = null;
				--size;
				return current.key;
			}
			prev = current;
		}
		return null;
		
		
	}

	@Override
	public boolean contains(String key) {
int index = Math.abs(key.hashCode())%buckets.length;
		
		for(ListNode current= buckets[index].next; current!=null; current = current.next){
			if(current.key.equals(key)){
				return true;
			}
		}
		
		return false;
		
		
	}

	@Override
	public int size() {
		
		return size;
		
		
	}

	@Override
	public void display() {

		for(int i=0;i<buckets.length;++i){
			for(ListNode current=buckets[i].next;current!=null;current=current.next){
				System.out.println("printing key and value in bucket:"+i+" key: "+current.key+ " value: "+current.value);
				
			}
			System.out.println("New Bucket");
		}
	}

}
