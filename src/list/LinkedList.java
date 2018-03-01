package list;


public class LinkedList implements ILinkedList{

	private Node head;
	private Node last;
	private Integer size;
	
	public LinkedList(){
		head = new Node();
		last = head;
		size =0;
	}
	@Override
	public void add(Integer i) {
		Node newNode = new Node(i);
		newNode.next = null;
		last.next = newNode;
		last = newNode;
		++size;
		
	}
	
	public Node getHead(){
		return this.head;
	}
	
	public Node getLast(){
		return this.last;
	}

	@Override
	public Integer get(Integer index) {
		
		return null;
		
		
	}

	@Override
	public void display() {
		 for(Node current = head.next; current!=null; current = current.next){
			 System.out.println(current.data);
		 }
	}

	@Override
	public int size() {
		
		return size;
		
		
	}

	
}
