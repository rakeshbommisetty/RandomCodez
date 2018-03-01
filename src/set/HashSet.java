package set;

public class HashSet implements ISet{

private int size;
private ListNode[] buckets;

private static int INITIAL_CAPACITY;
private static final float LOAD_FACTOR = 0.75f;
private static int THRESHOLD; 

public HashSet(){
	INITIAL_CAPACITY = 16;
	THRESHOLD = (int) (INITIAL_CAPACITY * LOAD_FACTOR);
	size =0;
	buckets = new ListNode[INITIAL_CAPACITY];
	for(int i=0;i<buckets.length;++i){
		buckets[i] = new ListNode();
	}
}

public HashSet(int capacity){
	INITIAL_CAPACITY = capacity;
	THRESHOLD = (int) (INITIAL_CAPACITY * LOAD_FACTOR);
	size =0;
	buckets = new ListNode[INITIAL_CAPACITY];
	for(int i=0;i<buckets.length;++i){
		buckets[i] = new ListNode();
	}
}

@Override
public boolean add(Integer i) {
	if(i==null || i.equals("")){
		return false;
	}
	int hash = Math.abs(i.hashCode());
	int index = hash% buckets.length;
	ListNode current= buckets[index];
	for(; current!=null; current = current.next){
		if(i==current.value){
			return false;
		}
	}
	
	if(size>=THRESHOLD){
		rehash();
	}
	
	index = Math.abs(i.hashCode()) % buckets.length;
	ListNode newNode = new ListNode(i);
	newNode.next = buckets[index].next;
	buckets[index].next = newNode;
	++size;
	return true;
	
	
}

private void rehash() {
	ListNode[] newBuckets = new ListNode[buckets.length*2];
	
	for(int i=0;i<newBuckets.length;++i){
		newBuckets[i] = new ListNode();
	}
	
	for(int i=0;i<buckets.length;++i){
		ListNode nextNode;
		for(ListNode current=buckets[i].next;current!=null;current = nextNode){
			int index = Math.abs(current.value.hashCode()) % newBuckets.length;
			nextNode = current.next;
			current.next = newBuckets[index].next;
			newBuckets[index].next = current;
		}
	}
	
	
	buckets = newBuckets;
	THRESHOLD = (int) (buckets.length * LOAD_FACTOR);
}

@Override
public boolean remove(Integer i) {
	
	if(i==null || i.equals("")){
		return false;
	}
	
	int index = Math.abs(i.hashCode()) % buckets.length;
	
	for(ListNode current = buckets[index]; current.next.next!= null; current = current.next){
		if(current.next.value.equals(i)){
			current.next = current.next.next;
			current.next.next = null;
			--size;
			return true;
		}
	}
	return false;
	
	
}

@Override
public boolean contains(Integer i) {
	
	if(i==null || i.equals("")){
		return false;
	}
	
int index = Math.abs(i.hashCode()) % buckets.length;
	
	for(ListNode current = buckets[index]; current.next!= null; current = current.next){
		if(current.next.value.equals(i)){
			return true;
		}
	}
	
	return false;
	
	
}

@Override
public void display() {
	
	for(int i=0;i<buckets.length;++i){
		System.out.println("bucket number:: "+i);
		for(ListNode current=buckets[i].next;current!=null;current = current.next){
			System.out.println("values are:: "+current.value);
		}
		System.out.println();
	}
	
	
}

@Override
public int size() {
	
	return size;
	
	
}



	
}
