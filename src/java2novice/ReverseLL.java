package java2novice;

class Node{
	int data;
	Node next;
	
	public Node(){}
	
	public Node(int data){
		this.data = data;
	}
}

public class ReverseLL {
	Node revHead = null;
public static void main(String[] args){
	ReverseLL rll = new ReverseLL();
	Node head = rll.createLL(5);
	rll.printLL(head);
	head = rll.reverseLL(head);
	System.out.println("after reversal");
	rll.printLL(head);
}

private Node reverseLL(Node head) {
	Node current = head.next;
	Node second = current.next;
	
	Node tail = reverse(current);
	tail.next = null;
	head.next = revHead;
	return head;
}


private Node reverse(Node head) {
	if(head.next == null){
		revHead = head;
		return head;
	}
	Node first = reverse(head.next);
	first.next = head;
	return head;
	
}

private void printLL(Node head) {
	
	for (Node current=head.next; current!=null; current=current.next){
		System.out.println("Node data is:: "+current.data);
	}
}

private Node createLL(int noOfNodes) {
	Node head = new Node();
	Node current = null;
	for(int i=0; i<noOfNodes; ++i){
		Node n = new Node(i);
		if(i==0)			
			head.next = n;
		else
			current.next = n;
		
		current = n;
		current.next=null;
	}
	return head;
}
}
